package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dependencyinjection.classes.EmailService
import com.example.dependencyinjection.classes.UserRegistrationService
import com.example.dependencyinjection.classes.UserRepository
import com.example.dependencyinjection.ui.theme.DependencyInjectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionTheme {

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DependencyInjectionTheme {
        val userRepository: UserRepository=UserRepository()
         val emailService: EmailService=EmailService()
        val newUser=UserRegistrationService(userRepository,emailService)
        newUser.registerUser("jaiswalrajib@123gmail.com","1234567")
    }
}