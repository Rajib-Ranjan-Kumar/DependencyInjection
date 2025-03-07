package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dependencyinjection.di.DaggerUserRegistrationComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val userRegistrationComponent = DaggerUserRegistrationComponent.create()
            val newUser = userRegistrationComponent.getUserRegistrationService()
            newUser.registerUser("jaiswalrajib@123gmail.com", "1234567")
        }
    }
}
