package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Car

interface ICarRepository {
    fun getAllCars(): List<Car>
    fun getCarById(id: Int): Car?
    fun addCar(car: Car): Boolean
    fun updateCar(car: Car): Boolean
    fun deleteCar(id: Int): Boolean
}
