package com.car.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.domain.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	Car findById(int id);
	List<Car> findByRented(boolean rented);
}
