package com.pmalaquias.jcautomechanics.presentation.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmalaquias.jcautomechanics.presentation.protocols.AuthResult
import com.pmalaquias.jcautomechanics.ui.pages.login.LoginUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * ViewModel for managing the login UI state and user authentication process.
 */
class LoginViewModel(/*private val loginUseCase: LoginUseCase*/) : ViewModel() {
    // Holds the result of the authentication process
    private var _authResult by mutableStateOf<AuthResult?>(null)
    // Publicly exposed immutable version of the authentication result
    val authResult: AuthResult? = _authResult
    // Holds the UI state for the login screen
    private val _uiState = MutableStateFlow(LoginUiState())
    // Publicly exposed immutable version of the UI state
    val uiState: StateFlow<LoginUiState> = _uiState

    // Two-way bindable properties for the email and password input fields
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    // Indicates whether the login process is currently loading
    var loading by mutableStateOf(false)
    // Holds any error message that should be displayed to the user
    var error by mutableStateOf("")
    // Indicates whether the user has chosen to be remembered on the device
    var isRemembered by mutableStateOf(false)
    // Controls the visibility of the password
    var isViewingPassword by mutableStateOf(false)

    /**
     * Updates the email state.
     * @param email The new email value.
     */
    fun onEmailChange(email: String) {
        this.email = email
    }

    /**
     * Updates the password state.
     * @param password The new password value.
     */
    fun onPasswordChange(password: String) {
        this.password = password
    }

    /**
     * Updates the remembered state.
     * @param isRemembered The new remembered value.
     */
    fun onRememberedChange(isRemembered: Boolean) {
        this.isRemembered = isRemembered
    }

    /**
     * Updates the viewing password state.
     * @param isViewingPassword The new viewing password value.
     */
    fun onViewingPasswordChange(isViewingPassword: Boolean) {
        this.isViewingPassword = isViewingPassword
    }

    /**
     * Clears the current error message.
     */
    fun clearError() {
        error = ""
    }

    /**
     * Checks if the form is valid (i.e., email and password are not empty).
     * @return True if the form is valid, false otherwise.
     */
    fun isFormValid(): Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }

    /**
     * Checks if the login process is currently loading.
     * @return True if loading, false otherwise.
     */
    fun isLoading(): Boolean {
        return loading
    }

    /**
     * Determines if the login button should be enabled based on form validity and loading state.
     * @return True if the login button should be enabled, false otherwise.
     */
    fun isLoginButtonEnabled(): Boolean {
        return isFormValid() && !loading
    }

    /**
     * Initiates the login process with the provided username and password.
     * @param username The username of the user attempting to log in.
     * @param password The password of the user attempting to log in.
     */
    fun login(username: String, password: String) {
        viewModelScope.launch {
            _authResult = AuthResult.Loading
            //_authResult = loginUseCase(username, password)
        }
    }

    /**
     * Resets the ViewModel to its initial state.
     */
    fun reset() {
        email = ""
        password = ""
        loading = false
        error = ""
        isRemembered = false
        isViewingPassword = false
    }
}