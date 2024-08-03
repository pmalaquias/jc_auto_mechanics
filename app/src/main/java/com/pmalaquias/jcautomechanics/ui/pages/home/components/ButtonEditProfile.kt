package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays a button for editing the profile.
 * The button is styled to fill the maximum width and has vertical padding.
 * When clicked, it triggers an action to edit the profile.
 */
@Composable
fun ButtonEditProfile(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    isEditable: Boolean = false
) {
    Button(
        onClick = {
            onClick()
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(
            text = if (isEditable) stringResource(R.string.button_save) else stringResource(R.string.button_edit_profile)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonEditProfilePreview() {
    JCAutoMechanicsTheme {
        ButtonEditProfile()
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonEditProfilePreview1() {
    JCAutoMechanicsTheme {
        ButtonEditProfile(isEditable = true)
    }
}