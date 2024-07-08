package com.pmalaquias.jcautomechanics.data.models

import java.time.LocalDateTime

/**
 * Represents an appointment in the auto mechanics system.
 *
 * @property id Unique identifier for the appointment.
 * @property carId Identifier for the car associated with this appointment.
 * @property serviceId Identifier for the service to be performed during this appointment.
 * @property mechanicId Identifier for the mechanic assigned to this appointment.
 * @property date The scheduled date and time for the appointment.
 * @property status The current status of the appointment (e.g., "scheduled", "completed").
 */
data class AppointmentModel(
    val id: Int,
    val carId: Int,
    val serviceId: Int,
    val mechanicId: Int,
    val date: LocalDateTime,
    val status: String
)
