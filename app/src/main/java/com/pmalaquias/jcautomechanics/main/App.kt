package com.pmalaquias.jcautomechanics.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmalaquias.jcautomechanics.presentation.viewModel.LoginViewModel
import com.pmalaquias.jcautomechanics.ui.pages.login.LoginPage
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

@Composable
fun App(
    modifier: Modifier = Modifier
) {

    val loginViewModel: LoginViewModel = viewModel()

    LoginPage(
        viewModel = loginViewModel
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    JCAutoMechanicsTheme {
        App()
    }
}