package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.User
import com.pmalaquias.jcautomechanics.domain.repositories.IUserRepository

class LoginUseCase(private val userRepository: IUserRepository) {
    fun execute(username: String, password: String): User? {
        val user = userRepository.getUserByUsername(username) ?: return null
        return if (user.password == password) user else null
    }

    fun login(username: String, password: String): Any {
        return userRepository.login(username, password)
    }
}
