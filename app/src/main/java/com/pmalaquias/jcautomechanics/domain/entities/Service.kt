package com.pmalaquias.jcautomechanics.domain.entities

data class Service(
    val id: Int,
    val carId: Int,
    val mechanicId: Int,
    val date: String,
    val description: String,
    val price: Double,
    val status: String
)
