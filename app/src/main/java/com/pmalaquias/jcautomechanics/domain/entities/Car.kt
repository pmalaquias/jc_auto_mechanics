package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a car in the auto mechanics system.
 *
 * @property id Unique identifier for the car.
 * @property brand The brand of the car (e.g., Toyota, Ford).
 * @property model The model of the car (e.g., Camry, Mustang).
 * @property year The manufacture year of the car.
 * @property color The color of the car.
 * @property licensePlate The license plate number of the car.
 * @property mileage The current mileage of the car in kilometers.
 * @property fuel The type of fuel the car uses (e.g., petrol, diesel, electric).
 * @property transmission The type of transmission in the car (e.g., manual, automatic).
 * @property image A URL or file path to an image of the car.
 */
data class Car(
    val id: Int,
    val brand: String,
    val model: String,
    val year: Int,
    val color: String,
    val licensePlate: String,
    val mileage: Int,
    val fuel: String,
    val transmission: String,
    val image: String
)
