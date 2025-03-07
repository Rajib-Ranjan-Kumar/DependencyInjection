package com.example.dependencyinjection.di

import com.example.dependencyinjection.services.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
}
