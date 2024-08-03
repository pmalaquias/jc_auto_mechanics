package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that displays the content for a workshop.
 * The content includes various sections such as workshop information, business information,
 * address information, additional information, and social media links.
 * The layout is scrollable and has padding.
 */
@Composable
fun WorkshopContent() {
    var text by rememberSaveable { mutableStateOf("") }
    var enabledSwitch by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SectionTitle(title = R.string.title_workshop_info)
            WorkshopProfilePhoto()
            Spacer(modifier = Modifier.height(16.dp))
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {// Seção de Informações da Oficina
            SectionTitle(title = R.string.title_business_info)
            WorkshopInfoField(label = R.string.field_business_name, value = "JC Auto Mecânica")
            WorkshopInfoField(label = R.string.field_trade_name, value = "JC Mecânica")
            WorkshopInfoField(label = R.string.field_cnpj, value = "00.000.000/0000-00")
            WorkshopInfoField(label = R.string.field_phone, value = "(00) 00000-0000")
            WorkshopInfoField(label = R.string.field_email, value = "oficina@example.com")
            WorkshopInfoField(label = R.string.field_pix_key, value = "00000000000")

            SectionTitle(title = R.string.title_address_info)
            AddressField(label = R.string.field_street, value = "Rua Exemplo")
            AddressField(label = R.string.field_number, value = "123")
            AddressField(label = R.string.field_neighborhood, value = "Centro")
            AddressField(label = R.string.field_city, value = "Cidade Exemplo")
            AddressField(label = R.string.field_state, value = "SP")
            AddressField(label = R.string.field_zip_code, value = "00000-000")
        }

       /* // Seção de Configurações
        SectionTitle(title = R.string.title_settings)
        SwitchField(
            label = "Notificações",
            checked = enabledSwitch,
            onCheckedChange = {
                enabledSwitch = it
                *//* Ação de ativar/desativar notificações *//*
            })
        DropDownField(
            label = "Tema",
            options = listOf("Claro", "Escuro"),
            selectedOption = "Claro",
            onOptionSelected = { *//* Ação de mudar tema *//* }
        )
        DropDownField(
            label = "Idioma",
            options = listOf("Português", "Inglês"),
            selectedOption = "Português",
            onOptionSelected = { *//* Ação de mudar idioma *//* }
        )*/

        //Spacer(modifier = Modifier.height(24.dp))

        // Seção de Informações Adicionais
        SectionTitle(title = R.string.title_additional_info)
        //TODO: Implementar campo de disponibilidade de horários

        MultiLineField(
            label = "Serviços Oferecidos",
            value = "Reparos em motores, Trocas de óleo, Inspeções de segurança, ...",
            onValueChange = { text = it }
        )

        SectionTitle(title = R.string.title_social_media)
        SocialMediaLinksSection()

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun WorkshopContentPreview() {
    JCAutoMechanicsTheme {
        WorkshopContent()
    }
}