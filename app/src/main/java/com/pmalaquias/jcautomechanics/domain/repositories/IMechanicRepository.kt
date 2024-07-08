package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Mechanic

/**
 * Interface for managing mechanic entities within the auto mechanics system.
 *
 * Provides operations for retrieving a list of mechanics that are currently available.
 */
interface IMechanicRepository {
    /**
     * Retrieves a list of mechanics that are currently available.
     *
     * @return List of [Mechanic] objects representing the available mechanics.
     */
    fun getAvailableMechanics(): List<Mechanic>
}
