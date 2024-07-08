package com.pmalaquias.jcautomechanics.domain.entities

/**
 * Represents an appointment in the auto mechanics system.
 *
 * @property id Unique identifier for the appointment.
 * @property car The car involved in the appointment.
 * @property service The service to be provided during the appointment.
 * @property mechanic The mechanic assigned to the appointment.
 * @property mechanicId The unique identifier of the mechanic assigned to the appointment.
 * @property date The date of the appointment.
 * @property description A description of the appointment details.
 * @property price The price of the service provided in the appointment.
 * @property status The current status of the appointment (e.g., "scheduled", "completed", "cancelled").
 */
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
