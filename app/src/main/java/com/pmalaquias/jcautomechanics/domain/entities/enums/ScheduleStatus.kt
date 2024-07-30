package com.pmalaquias.jcautomechanics.domain.entities.enums

/**
 * Enum class representing the status of a schedule.
 * Possible values are:
 * - PENDING: The schedule is pending confirmation.
 * - CONFIRMED: The schedule has been confirmed.
 * - COMPLETED: The schedule has been completed.
 * - CANCELLED: The schedule has been cancelled.
 * - NO_SHOW: The customer did not show up for the schedule.
 */
enum class ScheduleStatus {
    PENDING,
    CONFIRMED,
    COMPLETED,
    CANCELLED,
    NO_SHOW
}
