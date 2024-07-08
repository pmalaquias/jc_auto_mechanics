package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a mechanic in the auto mechanics system.
 *
 * @property id Unique identifier for the mechanic.
 * @property name The name of the mechanic.
 * @property email The email address of the mechanic.
 * @property phone The phone number of the mechanic.
 * @property address The physical address of the mechanic.
 * @property image A URL or file path to an image of the mechanic.
 * @property services A list of services offered by the mechanic.
 * @property cars A list of cars the mechanic is specialized in.
 * @property expertise The area of expertise of the mechanic.
 * @property experienceYears The number of years the mechanic has been in the field.
 */
data class Mechanic(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val image: String,
    val services: List<Service>,
    val cars: List<Car>,
    val expertise: String,
    val experienceYears: Int
)
