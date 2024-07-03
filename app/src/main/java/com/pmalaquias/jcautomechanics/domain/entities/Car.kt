package com.pmalaquias.jcautomechanics.domain.entities

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
