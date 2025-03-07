//import com.example.dependencyinjection.classes.EmailService
//import com.example.dependencyinjection.classes.UserRegistrationService
//import com.example.dependencyinjection.classes.UserRepository
//import dagger.Module
//import dagger.Provides
//
//// UserRegistrationModule
//@Module
//class UserRegistrationModule {
//    @Provides
//    fun provideUserRepository(): UserRepository {
//        return UserRepository()
//    }
//
//    @Provides
//    fun provideEmailService(): EmailService {
//        return EmailService()
//    }
//
//    @Provides
//    fun provideUserRegistrationService(userRepository: UserRepository, emailService: EmailService): UserRegistrationService {
//        return UserRegistrationService(userRepository, emailService)
//    }
//}