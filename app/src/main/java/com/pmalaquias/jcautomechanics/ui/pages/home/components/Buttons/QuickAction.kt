package com.pmalaquias.jcautomechanics.ui.pages.home.components.Buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.PersonAdd
import androidx.compose.material.icons.outlined.Receipt
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R

/**
 * A composable function that displays a row of quick action buttons.
 * The row is horizontally scrollable and contains buttons for various quick actions.
 */
@Composable
fun QuickActionsRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .scrollable(
                state = rememberScrollState(),
                orientation = Orientation.Horizontal,
            ),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        QuickActionButton(
            text = R.string.button_new_customer,
            icon = Icons.Outlined.PersonAdd,
            onClick = { /*TODO*/ }
        )
        QuickActionButton(
            text = R.string.button_new_calling,
            icon = Icons.Outlined.Build,
            onClick = { /*TODO*/ }
        )
        QuickActionButton(
            text = R.string.button_generate_invoice,
            icon = Icons.Outlined.Receipt,
            onClick = { /*TODO*/ }
        )
    }
}

/**
 * A composable function that displays a quick action button.
 * The button is represented as a card containing an icon and a text label.
 *
 * @param modifier A [Modifier] applied to the card, allowing for customization of its size, padding, etc.
 * @param text The resource ID of the text to be displayed on the button.
 * @param icon The [ImageVector] icon to be displayed on the button.
 * @param contentDescription The content description for the icon, used for accessibility.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun QuickActionButton(
    modifier: Modifier = Modifier,
    @StringRes text: Int,
    icon: ImageVector,
    contentDescription: String? = null,
    onClick: () -> Unit,
) {
    Card(
        modifier = modifier
            .height(90.dp)
            .width(110.dp),
        onClick = onClick,
        colors = CardDefaults.cardColors(
            MaterialTheme.colorScheme.surfaceContainerLow
        ),
        elevation = CardDefaults.cardElevation(
            4.dp,
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = stringResource(id = text),
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}
