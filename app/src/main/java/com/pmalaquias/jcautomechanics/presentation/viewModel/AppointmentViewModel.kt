package com.pmalaquias.jcautomechanics.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.pmalaquias.jcautomechanics.domain.entities.Appointment
import com.pmalaquias.jcautomechanics.domain.usecases.GetAvailableMechanicsUseCase
import com.pmalaquias.jcautomechanics.domain.usecases.ScheduleAppointmentUseCase

class AppointmentViewModel(
    private val scheduleAppointmentUseCase: ScheduleAppointmentUseCase,
    private val getAvailableMechanicsUseCase: GetAvailableMechanicsUseCase
) : ViewModel() {


    fun scheduleAppointment(appointment: Appointment): Boolean {
        return scheduleAppointmentUseCase.execute(appointment)
    }
}
