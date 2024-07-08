package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a user within the auto mechanics system.
 *
 * @property id Unique identifier for the user.
 * @property username The username of the user.
 * @property password The password of the user. It is recommended to store this in encrypted form.
 * @property role The role assigned to the user, determining their access level and permissions within the system.
 */
data class User(
    val id: Int,
    val username: String,
    val password: String,
    val role: Role
)