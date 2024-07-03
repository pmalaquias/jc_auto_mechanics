package com.pmalaquias.jcautomechanics

import com.pmalaquias.jcautomechanics.domain.entities.*
import com.pmalaquias.jcautomechanics.domain.repositories.IUserRepository
import com.pmalaquias.jcautomechanics.domain.usecases.LoginUseCase
import junit.framework.TestCase.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class LoginUseCaseTest {

    private lateinit var userRepository: IUserRepository
    private lateinit var loginUseCase: LoginUseCase

    @Before
    fun setup() {
        userRepository = mock(IUserRepository::class.java)
        loginUseCase = LoginUseCase(userRepository)
    }

    @Test
    fun `login with valid credentials should return user`() {
        val username = "testUser"
        val password = "password"
        val user = User(1, username, password, Role(1, "Client"))

        `when`(userRepository.login(username, password)).thenReturn(user)

        val result = loginUseCase.login(username, password)

        assertNotNull(result)
        assertEquals(user, result)
    }

    @Test
    fun `login with invalid credentials returns null`() {
        val username = "testuser"
        val password = "password"
        val user = User(1, username, "wrongpassword", Role(1, "Client"))

        `when`(userRepository.getUserByUsername(username)).thenReturn(user)

        val result = loginUseCase.execute(username, password)

        assertNull(result)
    }

}