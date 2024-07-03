package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.Appointment
import com.pmalaquias.jcautomechanics.domain.repositories.IAppointmentRepository

class ScheduleAppointmentUseCase(private val appointmentRepository: IAppointmentRepository) {
    fun execute(appointment: Appointment): Boolean = appointmentRepository.schedule(appointment)
}
