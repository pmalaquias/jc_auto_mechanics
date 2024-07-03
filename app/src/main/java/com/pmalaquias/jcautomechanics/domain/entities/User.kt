package com.pmalaquias.jcautomechanics.domain.entities

data class User(
    val id: Int,
    val username: String,
    val password: String,
    val role: Role
)