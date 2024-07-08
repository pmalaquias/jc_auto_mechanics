package com.pmalaquias.jcautomechanics.data.models

/**
 * Represents a car in the auto mechanics system.
 *
 * @property id Unique identifier for the car.
 * @property brand The brand of the car (e.g., Toyota, Ford).
 * @property model The specific model of the car (e.g., Camry, F-150).
 * @property year The manufacture year of the car.
 * @property licensePlate The car's license plate number, unique to each vehicle.
 */
data class CarModel(
    val id: Int,
    val brand: String,
    val model: String,
    val year: Int,
    val licensePlate: String
)
