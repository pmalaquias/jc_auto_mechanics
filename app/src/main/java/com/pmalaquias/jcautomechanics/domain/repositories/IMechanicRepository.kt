package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Mechanic

interface IMechanicRepository {
    fun getAvailableMechanics(): List<Mechanic>
}
