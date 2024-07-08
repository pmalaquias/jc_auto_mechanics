package com.pmalaquias.jcautomechanics.ui.pages.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that creates a button with an icon and label for login purposes.
 *
 * @param modifier The modifier to be applied to the button. Defaults to [Modifier].
 * @param enabled Determines if the button is enabled or not. Defaults to true.
 * @param image The resource ID of the image to be used as the icon in the button.
 * @param description An optional description for the image, used for accessibility purposes.
 * @param iconLabel The text label displayed next to the icon.
 * @param onClick The callback to be invoked when the button is clicked. Must not be null.
 */
@Composable
fun LoginWithButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    image: Int,
    description: String? = null,
    iconLabel: String,
    onClick: () -> Unit = null!!
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.height(48.dp).width(150.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = description,
            modifier = modifier.height(24.dp)
        )
        Spacer(modifier = modifier.width(8.dp))
        Text(iconLabel)
    }
}

/**
 * Provides a preview of the `LoginWithButton` composable function within the IDE.
 * This preview function showcases the `LoginWithButton` with predefined parameters,
 * specifically using a Google logo and label. It is intended for design and layout testing
 * within the Android Studio environment and does not execute in the actual application.
 */
@Composable
@Preview(showBackground = true)
fun LoginWithButtonPreview() {
    JCAutoMechanicsTheme {
        LoginWithButton(
            image = R.drawable.google__g__logo,
            iconLabel = "Google",
            onClick = { /*TODO*/ }
        )
    }
}
