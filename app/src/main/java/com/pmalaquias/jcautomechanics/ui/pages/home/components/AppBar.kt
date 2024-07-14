package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.annotation.StringRes
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that creates a top app bar with a title.
 *
 * This function utilizes the Material3 `TopAppBar` component to display a top app bar with a title text. The title is provided
 * as a string resource ID, allowing for localization. This composable can be used across different screens within the app
 * to maintain a consistent app bar appearance.
 *
 * @param title The resource ID of the string to be used as the title of the app bar.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    @StringRes title: Int
) {
    TopAppBar(
        title = { Text(stringResource(title)) }
    )
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    JCAutoMechanicsTheme {
        AppBar(title = R.string.title_home)
    }
}