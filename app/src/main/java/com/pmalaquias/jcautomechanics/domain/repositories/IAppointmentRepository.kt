package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Appointment

/**
 * Interface for managing appointments in the auto mechanics system.
 *
 * This interface defines the operations for scheduling new appointments and retrieving a list of existing appointments.
 */
interface IAppointmentRepository {
    /**
     * Schedules a new appointment.
     *
     * @param appointment The appointment to be scheduled.
     * @return Boolean indicating whether the appointment was successfully scheduled.
     */
    fun schedule(appointment: Appointment): Boolean

    /**
     * Retrieves a list of all scheduled appointments.
     *
     * @return List of [Appointment] objects.
     */
    fun getAppointments(): List<Appointment>
}
