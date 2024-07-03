package com.pmalaquias.jcautomechanics.data.models

import java.time.LocalDateTime

data class AppointmentModel(
    val id: Int,
    val carId: Int,
    val serviceId: Int,
    val mechanicId: Int,
    val date: LocalDateTime,
    val status: String
)
