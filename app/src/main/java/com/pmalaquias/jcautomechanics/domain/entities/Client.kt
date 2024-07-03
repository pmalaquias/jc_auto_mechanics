package com.pmalaquias.jcautomechanics.domain.entities

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