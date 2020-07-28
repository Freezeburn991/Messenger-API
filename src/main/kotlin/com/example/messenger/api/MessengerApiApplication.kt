package com.example.messenger.api

import com.example.messenger.api.repositories.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MessengerApiApplication {

    @Bean
    fun init(userRepository: UserRepository) = CommandLineRunner {
        //userRepository.save(User())
    }
}

fun main(args: Array<String>) {
    val run = SpringApplication.run(MessengerApiApplication::class.java, *args)
}