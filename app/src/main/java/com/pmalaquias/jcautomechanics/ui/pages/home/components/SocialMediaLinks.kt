package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays a social media link with an icon and text.
 * The icon and text are displayed in a row with some padding.
 *
 * @param iconResId The resource ID of the drawable icon to be displayed.
 * @param value The text value to be displayed next to the icon.
 * @param modifier The modifier to be applied to the row. Defaults to [Modifier].
 */
@Composable
fun SocialMediaLinks(
    @DrawableRes iconResId: Int,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(vertical = 4.dp)) {

        Image(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            modifier = Modifier.height(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

@Composable
fun SocialMediaLinksSection() {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        SocialMediaLinks(
            iconResId = R.drawable.instagram_logo_2016,
            value = "@jcautomecanica"
        )
        Spacer(modifier = Modifier.width(16.dp))
        SocialMediaLinks(
            iconResId = R.drawable.facebook_icon,
            value = "/jcautomecanica"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSocialMediaLinks() {
    JCAutoMechanicsTheme {
        SocialMediaLinksSection()
    }
}