package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays the content for a person's profile.
 * The content includes personal information fields and a button to edit the profile.
 * The layout is scrollable and has padding.
 */
@Composable
fun PersonContent() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Seção de Informações Pessoais
            SectionTitle(title = R.string.title_personal_info)
            UserProfilePhoto()
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                UserInfoField(label = R.string.field_full_name, value = "Nome do Usuário")
                UserInfoField(label = R.string.field_email, value = "email@example.com")
                UserInfoField(label = R.string.field_phone, value = "(00) 00000-0000")
                UserInfoField(label = R.string.field_password, value = "******", isPassword = true)
            }
        }
        ButtonEditProfile()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonContent() {
    JCAutoMechanicsTheme {
        PersonContent()
    }
}