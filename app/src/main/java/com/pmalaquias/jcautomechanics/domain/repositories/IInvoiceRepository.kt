package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Invoice

/**
 * Interface representing the repository for managing invoices.
 * Provides methods for creating, updating, deleting, and retrieving invoices.
 */
interface IInvoiceRepository {
    /**
     * Creates a new invoice.
     *
     * @param invoice The invoice to be created.
     * @return The ID of the created invoice.
     */
    suspend fun createInvoice(invoice: Invoice): Long

    /**
     * Updates an existing invoice.
     *
     * @param invoice The invoice to be updated.
     */
    suspend fun updateInvoice(invoice: Invoice)

    /**
     * Deletes an existing invoice.
     *
     * @param invoice The invoice to be deleted.
     */
    suspend fun deleteInvoice(invoice: Invoice)

    /**
     * Retrieves an invoice by its ID.
     *
     * @param id The ID of the invoice to be retrieved.
     * @return The invoice with the specified ID, or null if not found.
     */
    suspend fun getInvoiceById(id: Long): Invoice?

    /**
     * Retrieves all invoices.
     *
     * @return A list of all invoices.
     */
    fun getAllInvoices(): List<Invoice>
}