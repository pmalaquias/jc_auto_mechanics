package com.pmalaquias.jcautomechanics.data.models

/**
 * Represents a service offered by the auto mechanics system.
 *
 * @property id Unique identifier for the service.
 * @property name The name of the service.
 * @property description A detailed description of the service.
 * @property price The cost of the service.
 */
data class ServiceModel(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double
)
