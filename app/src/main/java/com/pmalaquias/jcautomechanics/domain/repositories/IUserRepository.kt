package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.User

interface IUserRepository {
    fun getUserByUsername(username: String): User?
    fun addUser(user: User): Boolean
    abstract fun login(username: String, password: String): Any
}
