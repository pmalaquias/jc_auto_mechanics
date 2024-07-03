package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Appointment

interface IAppointmentRepository {
    fun schedule(appointment: Appointment): Boolean
    fun getAppointments(): List<Appointment>
}
