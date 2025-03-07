package com.example.dependencyinjection.services

import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, pass: String) {
        println("User saved: $email")
    }
}

class EmailService @Inject constructor() {
    fun sendEmail(email: String) {
        println("Email sent to: $email")
    }
}

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {
    fun registerUser(email: String, pass: String) {
        userRepository.saveUser(email, pass)
        emailService.sendEmail(email)
    }
}