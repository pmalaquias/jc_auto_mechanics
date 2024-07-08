package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.User
import com.pmalaquias.jcautomechanics.domain.repositories.IUserRepository
import com.pmalaquias.jcautomechanics.presentation.protocols.AuthResult

/**
 * Defines the use case for user login functionality.
 *
 * @property userRepository Provides access to user-related data operations.
 */
class LoginUseCase(private val userRepository: IUserRepository) {

    /**
     * Attempts to authenticate a user with the provided username and password.
     *
     * @param username The username of the user attempting to log in.
     * @param password The password of the user attempting to log in.
     * @return The authenticated [User] object if credentials are valid, null otherwise.
     */
    fun execute(username: String, password: String): User? {
        val user = userRepository.getUserByUsername(username) ?: return null
        return if (user.password == password) user else null
    }

    /**
     * Operator function to provide a more idiomatic way of performing user login.
     * It wraps the result of the login attempt in an [AuthResult].
     *
     * @param username The username of the user attempting to log in.
     * @param password The password of the user attempting to log in.
     * @return [AuthResult.Success] with the user if credentials are valid, [AuthResult.Error] otherwise.
     */
    operator fun invoke(username: String, password: String): AuthResult {
        return userRepository.login(username, password).let { AuthResult.Success(it) } ?: AuthResult.Error("Invalid credentials")
    }
}
