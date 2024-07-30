package com.pmalaquias.jcautomechanics.domain.entities

import com.pmalaquias.jcautomechanics.domain.entities.enums.InvoiceStatus
import java.util.Date

/**
 * Data class representing an invoice within the application.
 *
 * @property id The unique identifier of the invoice. Defaults to 0.
 * @property clientName The name of the client associated with the invoice.
 * @property dateIssued The date when the invoice was issued.
 * @property totalAmount The total amount of the invoice.
 * @property status The current status of the invoice, represented by [InvoiceStatus].
 * @property services The list of services provided, associated with the invoice.
 * @property notes Optional notes or comments related to the invoice.
 */
data class Invoice (
    val id: Long = 0,
    val clientName: String,
    val dateIssued: Date,
    val totalAmount: Double,
    val status: InvoiceStatus,
    val services: List<Service>, // List of services provided
    val notes: String? = null
)
