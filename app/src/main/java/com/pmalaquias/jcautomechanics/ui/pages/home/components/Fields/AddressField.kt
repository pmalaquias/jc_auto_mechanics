package com.pmalaquias.jcautomechanics.ui.pages.home.components.Fields

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays an address field.
 * The field can optionally be editable.
 *
 * @param label The resource ID of the label text to be displayed.
 * @param value The current value of the text field.
 * @param modifier The modifier to be applied to the text field. Defaults to [Modifier].
 * @param canEdit Whether the text field should be editable. Defaults to false.
 */
@Composable
fun AddressField(
    @StringRes label: Int,
    value: String,
    modifier: Modifier = Modifier,
    canEdit: Boolean = false
) {
    TextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        label = { Text(text = stringResource(label)) },
        onValueChange = {},
        enabled = canEdit
    )
}

@Preview(showBackground = true)
@Composable
fun AddressFieldPreview() {
    JCAutoMechanicsTheme {
        AddressField(
            label = R.string.field_street,
            value = "Rua Exemplo"
        )
    }
}