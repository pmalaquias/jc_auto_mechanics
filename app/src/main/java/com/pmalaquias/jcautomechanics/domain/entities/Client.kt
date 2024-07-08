package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a client in the auto mechanics system.
 *
 * @property id Unique identifier for the client.
 * @property name The name of the client.
 * @property email The email address of the client.
 * @property phone The phone number of the client.
 * @property address The physical address of the client.
 * @property image A URL or file path to an image of the client.
 * @property cars A list of cars owned by the client.
 * @property appointments A list of appointments the client has made.
 */
data class Client (
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val image: String,
    val cars: List<Car>,
    val appointments: List<Appointment>
)