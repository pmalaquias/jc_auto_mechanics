package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.EventBusy
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.domain.entities.ScheduleItem
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * A composable function that displays today's schedule.
 * If the schedule is empty, it shows a message indicating no scheduled items.
 * Otherwise, it displays a list of up to 5 schedule items.
 *
 * @param scheduleItems A list of [ScheduleItem] objects representing today's schedule.
 */
@Composable
fun TodaysSchedule(scheduleItems: List<ScheduleItem>) {
    Column(modifier = Modifier) {
        if (scheduleItems.isEmpty()) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Outlined.EventBusy,
                    contentDescription = null,
                    modifier = Modifier.size(48.dp)
                )
                Text(
                    text = stringResource(R.string.message_no_schedule),
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center,
                )
            }
        } else {
            LazyColumn {
                items(scheduleItems.take(5)) { item ->
                    ScheduleItemCard(item)
                }
            }
        }
    }
}

/**
 * A composable function that displays a card representing a schedule item.
 * The card includes the time, client name, and service description of the schedule item.
 *
 * @param item The [ScheduleItem] to be displayed in the card.
 */
@Composable
fun ScheduleItemCard(item: ScheduleItem) {
    val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.elevatedCardElevation(
            4.dp
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = dateFormat.format(item.time),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = item.clientName,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = item.serviceDescription,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

