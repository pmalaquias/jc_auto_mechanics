package com.pmalaquias.jcautomechanics.domain.usecases

import com.pmalaquias.jcautomechanics.domain.entities.Car
import com.pmalaquias.jcautomechanics.domain.repositories.ICarRepository

class GetAllCarsUseCase(private val carRepository: ICarRepository) {
    fun execute(): List<Car> = carRepository.getAllCars()
}
