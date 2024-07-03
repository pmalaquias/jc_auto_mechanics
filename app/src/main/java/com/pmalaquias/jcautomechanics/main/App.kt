package com.pmalaquias.jcautomechanics.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

@Composable
fun App(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    JCAutoMechanicsTheme {
        App("Android")
    }
}