package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Service

interface IServiceRepository {
    fun getServices(): List<Service>
}
