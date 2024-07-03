package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Client

interface IClientRepository {
    fun getAllClients(): List<Client>
    fun getClientById(id: Int): Client?
    fun addClient(client: Client): Boolean
    fun updateClient(client: Client): Boolean
    fun deleteClient(id: Int): Boolean
}