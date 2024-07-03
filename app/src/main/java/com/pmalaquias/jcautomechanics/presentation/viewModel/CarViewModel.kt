package com.pmalaquias.jcautomechanics.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.pmalaquias.jcautomechanics.domain.usecases.GetAllCarsUseCase

class CarViewModel(private val getAllCarsUseCase: GetAllCarsUseCase) : ViewModel() {

}
