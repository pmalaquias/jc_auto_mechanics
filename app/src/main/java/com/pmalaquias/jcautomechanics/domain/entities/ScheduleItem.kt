package com.pmalaquias.jcautomechanics.domain.entities

import com.pmalaquias.jcautomechanics.domain.entities.enums.ScheduleStatus
import java.util.Date

/**
 * Represents a schedule item.
 *
 * @property id The unique identifier of the schedule item.
 * @property status The status of the schedule item.
 * @property time The time of the schedule item.
 * @property clientName The name of the client associated with the schedule item.
 * @property serviceDescription The description of the service for the schedule item.
 * @property serviceName The name of the service for the schedule item.
 */
data class ScheduleItem(
    val id: Int,
    val status: ScheduleStatus,
    val time: Date,
    val clientName: String,
    val serviceDescription: String,
    val serviceName: String,
)