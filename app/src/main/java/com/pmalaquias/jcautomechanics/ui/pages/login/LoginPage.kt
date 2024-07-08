package com.pmalaquias.jcautomechanics.ui.pages.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.presentation.viewModel.LoginViewModel
import com.pmalaquias.jcautomechanics.ui.pages.login.components.LoginWithButton
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * Displays the login page UI.
 *
 * This composable function sets up the layout for the login page, including text fields for email and password,
 * a login button, options to remember the user, and buttons for alternative login methods. It uses a [LoginViewModel]
 * to manage the state of the UI elements and interact with the business logic.
 *
 * @param modifier A [Modifier] for customizing the layout's appearance and behavior. Defaults to [Modifier].
 * @param viewModel The [LoginViewModel] that holds the state and handles logic for the login process.
 */
@Composable
fun LoginPage(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel
) {
    Scaffold { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                Icons.Default.Settings, contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(stringResource(R.string.title_enter_your_email_and_password_to_login))
                TextField(
                    modifier = modifier.fillMaxWidth(),
                    value = viewModel.email,
                    onValueChange = { viewModel.onEmailChange(it) },
                    label = { Text(stringResource(R.string.label_e_mail)) },
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            Icons.Default.Email,
                            contentDescription = null
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.12f),
                    )
                )
                TextField(
                    modifier = modifier.fillMaxWidth(),
                    value = viewModel.password,
                    visualTransformation = if (viewModel.isViewingPassword) VisualTransformation.None else PasswordVisualTransformation(),
                    onValueChange = { viewModel.onPasswordChange(it) },
                    label = { Text(stringResource(R.string.label_password)) },
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            Icons.Default.Lock,
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        IconButton(
                            onClick = { viewModel.onViewingPasswordChange(!viewModel.isViewingPassword) }
                        ) {
                            Icon(
                                if (viewModel.isViewingPassword) Icons.Default.VisibilityOff else
                                Icons.Default.Visibility,
                                contentDescription = null
                            )
                        }
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.12f),
                    )
                )
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = viewModel.isRemembered,
                            onCheckedChange = { viewModel.onRememberedChange(it) })
                        Text(stringResource(R.string.label_remember_me))

                    }
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(stringResource(R.string.button_forgot_password))
                    }
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = modifier.fillMaxWidth(),
                    enabled = viewModel.isLoginButtonEnabled()
                ) {
                    Text(stringResource(R.string.label_login))
                }

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    HorizontalDivider(modifier = modifier.weight(1f))
                    Text(
                        stringResource(R.string.label_or_login_with),
                        modifier = modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    HorizontalDivider(modifier = modifier.weight(1f))
                }

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    LoginWithButton(
                        image = R.drawable.google__g__logo,
                        iconLabel = stringResource(R.string.label_google),
                        onClick = { /*TODO*/ }
                    )
                    LoginWithButton(
                        image = R.drawable.facebook_icon,
                        iconLabel = stringResource(R.string.label_facebook),
                        onClick = { /*TODO*/ }
                    )
                }
            }

            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(stringResource(R.string.title_don_t_have_an_account))
                TextButton(onClick = { /*TODO*/ }) {
                    Text(stringResource(R.string.label_sign_up))
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginPagePreview() {
    JCAutoMechanicsTheme {
        LoginPage(
            viewModel = LoginViewModel()
        )
    }
}

