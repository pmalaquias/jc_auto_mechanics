package com.pmalaquias.jcautomechanics.data.models

/**
 * Represents a client in the auto mechanics system.
 *
 * @property id Unique identifier for the client.
 * @property name The name of the client.
 * @property email The email address of the client.
 * @property phoneNumber The phone number of the client.
 * @property address The physical address of the client.
 */
data class ClientModel(
    val id: Int,
    val name: String,
    val email: String,
    val phoneNumber: String,
    val address: String
)