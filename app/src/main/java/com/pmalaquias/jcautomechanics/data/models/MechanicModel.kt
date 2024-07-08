package com.pmalaquias.jcautomechanics.data.models

/**
 * Represents a mechanic in the auto mechanics system.
 *
 * @property id Unique identifier for the mechanic.
 * @property name The name of the mechanic.
 * @property expertise The area of expertise of the mechanic (e.g., engine repair, bodywork).
 * @property experienceYears The number of years the mechanic has been working in their field of expertise.
 */
data class MechanicModel(
    val id: Int,
    val name: String,
    val expertise: String,
    val experienceYears: Int
)
