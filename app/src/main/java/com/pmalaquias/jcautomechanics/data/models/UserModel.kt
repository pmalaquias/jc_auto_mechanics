package com.pmalaquias.jcautomechanics.data.models

/**
 * Represents a user in the auto mechanics system.
 *
 * @property id Unique identifier for the user.
 * @property username The username of the user.
 * @property password The password of the user. It is recommended to store passwords securely, not in plain text.
 * @property role The role of the user within the system (e.g., "admin", "mechanic", "client").
 */
data class UserModel(
    val id: Int,
    val username: String,
    val password: String,
    val role: String
)
