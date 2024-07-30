package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Receipt
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.domain.entities.Invoice
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * A composable function that displays a list of the latest invoices.
 * If the list of invoices is empty, it shows a message indicating no invoices.
 * Otherwise, it displays a horizontally scrollable list of up to 5 invoices.
 *
 * @param invoices A list of [Invoice] objects to be displayed. Defaults to an empty list.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LastInvoicesList(invoices: List<Invoice> = emptyList()) {
    if (invoices.isEmpty()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Outlined.Receipt,
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
            Text(
                text = stringResource(R.string.message_no_invoice),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
        }
    } else {

        /*HorizontalMultiBrowseCarousel(
            state = rememberCarouselState { invoices.size },
            modifier = Modifier
                .width(412.dp)
                .height(150.dp),
            preferredItemWidth = 186.dp,
            itemSpacing = 8.dp,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) { i ->
            InvoiceItem(invoices[i])
        }*/

        Box(
            modifier = Modifier.height(150.dp),
            contentAlignment = Alignment.Center

        ){
            Column (
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.scrollable(
                    state = rememberCarouselState { invoices.size },
                    enabled = true,
                    orientation = Orientation.Horizontal,
                )
            ){
                LazyColumn {
                    items(invoices.take(5)) { invoice ->
                        InvoiceItem(invoice)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }

}

/**
 * A composable function that displays an invoice item.
 * The invoice item is represented as a card containing the client's name,
 * the date issued, the total amount, and the status of the invoice.
 *
 * @param invoice The [Invoice] object containing the details of the invoice to be displayed.
 */
@Composable
fun InvoiceItem(invoice: Invoice) {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        //colors = CardDefaults.cardColors(MaterialTheme.colorScheme.tertiaryContainer),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            FormatField(stringResource(R.string.field_client), invoice.clientName)
            FormatField(stringResource(R.string.field_date), dateFormat.format(invoice.dateIssued))
            FormatField(stringResource(R.string.field_total), "R$ ${invoice.totalAmount}")
            FormatField(stringResource(R.string.field_status), invoice.status.toString())
        }
    }
}

/**
 * A composable function that displays a formatted field with a label and value.
 * The label and value are displayed in a row, with the label using a larger text style.
 *
 * @param label The label text to be displayed.
 * @param value The value text to be displayed.
 */
@Composable
fun FormatField(label: String, value: String) {
    Row {
        Text(text = label, style = MaterialTheme.typography.labelLarge)
        Text(text = value, style = MaterialTheme.typography.bodyMedium)
    }
}