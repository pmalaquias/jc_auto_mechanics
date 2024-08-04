package com.pmalaquias.jcautomechanics.ui.pages.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.domain.entities.Invoice
import com.pmalaquias.jcautomechanics.domain.entities.ScheduleItem
import com.pmalaquias.jcautomechanics.domain.entities.Service
import com.pmalaquias.jcautomechanics.domain.entities.enums.InvoiceStatus
import com.pmalaquias.jcautomechanics.domain.entities.enums.ScheduleStatus
import com.pmalaquias.jcautomechanics.ui.pages.home.components.AppBar
import com.pmalaquias.jcautomechanics.ui.pages.home.components.LastInvoicesList
import com.pmalaquias.jcautomechanics.ui.pages.home.components.Buttons.QuickActionsRow
import com.pmalaquias.jcautomechanics.ui.pages.home.components.SectionTitle
import com.pmalaquias.jcautomechanics.ui.pages.home.components.TodaysSchedule
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * A composable function that defines the layout and behavior of the Dashboard screen within the application.
 * This screen utilizes a [Scaffold] layout to provide a consistent structure, including a top app bar
 * and a content area. The top app bar is created using the [AppBar] composable function, which is passed
 * the title resource ID [R.string.title_home]. The content area is defined by a [Column] layout, which
 * can be populated with additional components as needed for displaying dashboard content such as statistics,
 * quick actions, or notifications.
 *
 * @param modifier A [Modifier] applied to the [Column] layout, allowing for customization of its size, padding, etc.
 *                 By default, it fills the maximum available size and applies padding defined by the [Scaffold].
 * @param invoices A list of [Invoice] objects to be displayed in the dashboard.
 * @param scheduleItems A list of [ScheduleItem] objects representing the daily schedule.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier,
    invoices: List<Invoice> = emptyList(),
    scheduleItems: List<ScheduleItem> = emptyList(),
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.title_home)) },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Notifications, contentDescription = "Notifications")
                    }
                }
            )

        }
    )
    { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
        ) {
            SectionTitle(title = R.string.title_letest_invoice)
            LastInvoicesList(invoices = invoices) // Lista de últimas notas fiscais

            Spacer(modifier = Modifier.height(16.dp))

            SectionTitle(title = R.string.title_quick_actions)
            QuickActionsRow() // Botões de ações rápidas

            Spacer(modifier = Modifier.height(16.dp))

            SectionTitle(title = R.string.title_daily_schedule)
            TodaysSchedule(scheduleItems) // Agenda do dia

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {

    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val hourFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

    val services = listOf(
        Service(
            id = 1,
            carId = 1,
            mechanicId = 1,
            date = dateFormat.parse("2023-06-01")!!,
            description = "Troca de óleo",
            price = 150.0,
            status = "completed"
        ),
        Service(
            id = 2,
            carId = 2,
            mechanicId = 2,
            date = dateFormat.parse("2023-06-10")!!,
            description = "Troca de pneus",
            price = 70.0,
            status = "pending"
        ),
        Service(
            id = 3,
            carId = 3,
            mechanicId = 3,
            date = dateFormat.parse("2023-06-15")!!,
            description = "Revisão geral",
            price = 320.0,
            status = "pending"
        ),
        Service(
            id = 4,
            carId = 4,
            mechanicId = 4,
            date = dateFormat.parse("2023-06-20")!!,
            description = "Troca de óleo",
            price = 130.0,
            status = "cancelled"
        ),
        // Adicione mais serviços para testes
    )


    val invoices = listOf(
        Invoice(
            id = 1,
            clientName = "João Silva",
            dateIssued = dateFormat.parse("2023-06-01")!!,
            totalAmount = 150.0,
            status = InvoiceStatus.PAID,
            services = services
        ),
        Invoice(
            id = 2,
            clientName = "Maria Souza",
            dateIssued = dateFormat.parse("2023-06-10")!!,
            totalAmount = 70.0,
            status = InvoiceStatus.PENDING,
            services = services
        ),
        Invoice(
            id = 3,
            clientName = "Carlos Pereira",
            dateIssued = dateFormat.parse("2023-06-15")!!,
            totalAmount = 320.0,
            status = InvoiceStatus.PENDING,
            services = services
        ),
        Invoice(
            id = 4,
            clientName = "Ana Costa",
            dateIssued = dateFormat.parse("2023-06-20")!!,
            totalAmount = 130.0,
            status = InvoiceStatus.CANCELLED,
            services = services
        ),
        Invoice(
            id = 5,
            clientName = "Lucas Lima",
            dateIssued = dateFormat.parse("2023-06-25")!!,
            totalAmount = 180.0,
            status = InvoiceStatus.PAID,
            services = services
        )
    )

    val scheduleItems = listOf(
        ScheduleItem(
            id = 1,
            clientName = "Ana Pereira",
            serviceName = "Troca de pneus",
            time = hourFormat.parse("09:00"),
            status = ScheduleStatus.PENDING,
            serviceDescription = "Troca de pneus fuso e preços"
        ),
        ScheduleItem(
            id = 2,
            clientName = "Carlos Souza",
            serviceName = "Revisão geral",
            time = hourFormat.parse( "11:00"),
            status = ScheduleStatus.COMPLETED,
            serviceDescription = "Revisão geral do veículo"
        ),
        // Adicione mais ScheduleItem para testes
    )

    JCAutoMechanicsTheme {
        DashboardScreen(
            invoices = invoices,
            scheduleItems = scheduleItems
        )
    }
}



