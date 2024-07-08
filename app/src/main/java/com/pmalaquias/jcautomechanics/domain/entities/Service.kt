package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents a service provided by the auto mechanics system.
 *
 * @property id Unique identifier for the service.
 * @property carId The unique identifier of the car receiving the service.
 * @property mechanicId The unique identifier of the mechanic providing the service.
 * @property date The date when the service is scheduled or was provided.
 * @property description A brief description of the service.
 * @property price The cost of the service.
 * @property status The current status of the service (e.g., "scheduled", "completed", "cancelled").
 */
data class Service(
    val id: Int,
    val carId: Int,
    val mechanicId: Int,
    val date: String,
    val description: String,
    val price: Double,
    val status: String
)
