package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Client

/**
 * Interface for managing client entities within the auto mechanics system.
 *
 * Provides operations for retrieving all clients, fetching a client by its ID,
 * adding a new client, updating an existing client, and deleting a client by its ID.
 */
interface IClientRepository {
    /**
     * Retrieves a list of all clients.
     *
     * @return List of [Client] objects.
     */
    fun getAllClients(): List<Client>

    /**
     * Retrieves a client by its unique identifier.
     *
     * @param id The unique identifier of the client.
     * @return The [Client] object if found, or null if not found.
     */
    fun getClientById(id: Int): Client?

    /**
     * Adds a new client to the repository.
     *
     * @param client The [Client] object to be added.
     * @return Boolean indicating whether the client was successfully added.
     */
    fun addClient(client: Client): Boolean

    /**
     * Updates an existing client in the repository.
     *
     * @param client The [Client] object with updated information.
     * @return Boolean indicating whether the client was successfully updated.
     */
    fun updateClient(client: Client): Boolean

    /**
     * Deletes a client from the repository using its unique identifier.
     *
     * @param id The unique identifier of the client to be deleted.
     * @return Boolean indicating whether the client was successfully deleted.
     */
    fun deleteClient(id: Int): Boolean
}