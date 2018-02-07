package com.car.service;

import com.car.domain.Car;
import java.util.List;

public interface CarService {
	List<Car> getUnrentedCar();
	Car update(String plateNumber);
	Car create(Car car);
}