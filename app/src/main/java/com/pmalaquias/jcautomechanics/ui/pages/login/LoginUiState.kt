package com.pmalaquias.jcautomechanics.ui.pages.login

/**
 * Represents the UI state for the login page.
 *
 * @property email The email input by the user.
 * @property password The password input by the user.
 * @property isLoading Indicates if the login process is currently in progress.
 * @property isLoggedIn Indicates if the user has successfully logged in.
 * @property isRemembered Indicates if the user's credentials should be remembered for future logins.
 * @property isViewingPassword Indicates if the password is currently visible to the user.
 * @property error Holds any error message that should be displayed to the user related to login.
 */
data class LoginUiState (
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val isLoggedIn: Boolean = false,
    val isRemembered: Boolean = false,
    val isViewingPassword: Boolean = false,
    val error: String = ""
)