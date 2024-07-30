package com.pmalaquias.jcautomechanics.domain.entities.enums

/**
 * Enum class representing the various statuses an invoice can have within the application.
 * Each status provides a clear indication of the current state of the invoice.
 */
enum class InvoiceStatus {
    PENDING, // A nota fiscal foi criada, mas ainda não foi emitida oficialmente.
    ISSUED, // A nota fiscal foi emitida e está aguardando pagamento.
    PAID, // O pagamento foi realizado e a nota fiscal está quitada.
    CANCELLED, // A nota fiscal foi cancelada e não é mais válida.
    LATE, // O pagamento da nota fiscal está atrasado.
    IN_PROCESS, // A nota fiscal está sendo processada para emissão.
    REFUSED, // O cliente recusou a nota fiscal e ela não será paga.
    IN_DISPUTE, // Existem disputas ou divergências em relação ao valor ou aos serviços prestados.
    PARTIALLY_PAID, // Parte do valor da nota fiscal foi paga, mas ainda existe saldo pendente.
    REFUNDED // O valor da nota fiscal foi reembolsado ao cliente.
}