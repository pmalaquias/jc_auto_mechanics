package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a role within the auto mechanics system.
 *
 * @property id Unique identifier for the role.
 * @property name The name of the role (e.g., "admin", "mechanic", "client").
 */
data class Role(
    val id: Int,
    val name: String
)