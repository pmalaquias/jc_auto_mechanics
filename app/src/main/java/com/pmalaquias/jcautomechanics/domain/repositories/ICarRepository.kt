package com.pmalaquias.jcautomechanics.domain.repositories

import com.pmalaquias.jcautomechanics.domain.entities.Car

/**
 * Interface for managing car entities within the auto mechanics system.
 *
 * Provides operations for retrieving all cars, fetching a car by its ID,
 * adding a new car, updating an existing car, and deleting a car by its ID.
 */
interface ICarRepository {
    /**
     * Retrieves a list of all cars.
     *
     * @return List of [Car] objects.
     */
    fun getAllCars(): List<Car>

    /**
     * Retrieves a car by its unique identifier.
     *
     * @param id The unique identifier of the car.
     * @return The [Car] object if found, or null if not found.
     */
    fun getCarById(id: Int): Car?

    /**
     * Adds a new car to the repository.
     *
     * @param car The [Car] object to be added.
     * @return Boolean indicating whether the car was successfully added.
     */
    fun addCar(car: Car): Boolean

    /**
     * Updates an existing car in the repository.
     *
     * @param car The [Car] object with updated information.
     * @return Boolean indicating whether the car was successfully updated.
     */
    fun updateCar(car: Car): Boolean

    /**
     * Deletes a car from the repository using its unique identifier.
     *
     * @param id The unique identifier of the car to be deleted.
     * @return Boolean indicating whether the car was successfully deleted.
     */
    fun deleteCar(id: Int): Boolean
}
