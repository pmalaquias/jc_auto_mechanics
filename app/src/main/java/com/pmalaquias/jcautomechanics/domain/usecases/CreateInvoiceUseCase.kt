package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.Invoice
import com.pmalaquias.jcautomechanics.domain.repositories.IInvoiceRepository

/**
 * Use case class for creating an invoice.
 * This class interacts with the [IInvoiceRepository] to create a new invoice.
 *
 * @property invoiceRepository The repository used to manage invoices.
 */
class CreateInvoiceUseCase(private val invoiceRepository: IInvoiceRepository) {

    /**
     * Invokes the use case to create a new invoice.
     *
     * @param invoice The invoice to be created.
     * @return The ID of the created invoice.
     */
    suspend operator fun invoke(invoice: Invoice): Long {
        return invoiceRepository.createInvoice(invoice)
    }
}