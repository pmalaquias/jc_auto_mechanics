package com.pmalaquias.jcautomechanics.ui.pages.home.components.Fields

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays a user information field.
 * The field can optionally be a password field.
 *
 * @param label The resource ID of the label text to be displayed.
 * @param value The current value of the text field.
 * @param isPassword Whether the text field should obscure the text for passwords. Defaults to false.
 * @param modifier The modifier to be applied to the text field. Defaults to [Modifier].
 */
@Composable
fun UserInfoField(
    @StringRes label: Int,
    value: String,
    isPassword: Boolean = false,
    modifier: Modifier = Modifier,
    canEdit: Boolean = false
) {
    TextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = {},
        label = { Text(text = stringResource(label)) },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        enabled = canEdit
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewUserInfoField() {
    JCAutoMechanicsTheme {
        UserInfoField(label = R.string.field_full_name, value = "Nome do Usuário", isPassword = false)
    }
}