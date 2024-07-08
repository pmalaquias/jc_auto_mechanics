package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Service

/**
 * Interface for managing service entities within the auto mechanics system.
 *
 * Provides operations for retrieving a list of all available services.
 */
interface IServiceRepository {
    /**
     * Retrieves a list of all services.
     *
     * @return List of [Service] objects representing the available services.
     */
    fun getServices(): List<Service>
}
