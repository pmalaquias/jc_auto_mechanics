package com.pmalaquias.jcautomechanics.domain.entities

data class Appointment(
    val id: Int,
    val car: Car,
    val service: Service,
    val mechanic: Mechanic,
    val mechanicId: Int,
    val date: String,
    val description: String,
    val price: Double,
    val status: String
)
