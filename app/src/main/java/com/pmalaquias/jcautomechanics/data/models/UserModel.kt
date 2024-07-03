package com.pmalaquias.jcautomechanics.data.models

data class UserModel(
    val id: Int,
    val username: String,
    val password: String,
    val role: String
)
