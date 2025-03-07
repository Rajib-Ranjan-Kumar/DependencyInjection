package com.example.dependencyinjection.classes

class UserRegistrationService(
    private val userRepository: UserRepository, private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply123@gmail.com", "U have register new email")
    }
}