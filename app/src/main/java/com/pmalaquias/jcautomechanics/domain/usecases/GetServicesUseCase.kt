package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.Service
import com.pmalaquias.jcautomechanics.domain.repositories.IServiceRepository

class GetServicesUseCase(private val serviceRepository: IServiceRepository) {
    fun execute(): List<Service> = serviceRepository.getServices()
}
