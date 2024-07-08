package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.User
import com.pmalaquias.jcautomechanics.presentation.protocols.AuthResult

/**
 * Interface defining the operations for user management and authentication.
 */
interface IUserRepository {
    /**
     * Retrieves a user by their username.
     *
     * @param username The username of the user to retrieve.
     * @return The [User] object if found, null otherwise.
     */
    fun getUserByUsername(username: String): User?

    /**
     * Adds a new user to the repository.
     *
     * @param user The [User] object to add.
     * @return True if the user was successfully added, false otherwise.
     */
    fun addUser(user: User): Boolean

    /**
     * Authenticates a user based on username and password.
     *
     * @param username The username of the user attempting to log in.
     * @param password The password of the user attempting to log in.
     * @return The authenticated [User] object.
     */
    abstract fun login(username: String, password: String): User
}
