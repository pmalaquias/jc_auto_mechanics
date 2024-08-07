package com.pmalaquias.jcautomechanics.ui.pages.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.pages.home.components.AppBar
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that defines the layout and behavior of the Invoices screen within the application.
 * This screen utilizes a [Scaffold] layout to provide a consistent structure, including a top app bar
 * and a content area. The top app bar is created using the [AppBar] composable function, which is passed
 * the title resource ID [R.string.title_invoices]. The content area is defined by a [Column] layout, which
 * can be populated with additional components as needed for displaying invoices.
 *
 * @param modifier A [Modifier] applied to the [Column] layout, allowing for customization of its size, padding, etc.
 *                 By default, it fills the maximum available size and applies padding defined by the [Scaffold].
 */
@Composable
fun InvoicesScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {AppBar(title = R.string.title_invoices)}
    )
    { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {}
    }

}

@Preview(showBackground = true)
@Composable
fun InvoicesScreenPreview() {
    JCAutoMechanicsTheme {
        InvoicesScreen()
    }
}