package com.pmalaquias.jcautomechanics.domain.entities

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
    val experienceYears: Int,

)
