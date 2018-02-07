package com.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.car.domain.Car;
import com.car.domain.CarRepository;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository carRepository;
	
	//Get a list of unrented cars
	public List<Car> getUnrentedCar() {
		return carRepository.findByRented(false);
	}
	
	//Update car information
	public Car update(String plateNumber) {
		Car carForUpdate = carRepository.findById(Integer.parseInt(plateNumber));
		if(carForUpdate != null) {
			carForUpdate.setRented(!carForUpdate.getRented());
		}
		return carRepository.save(carForUpdate);
	}
	
	//create car 
	public Car create(Car car){
		return carRepository.save(car);
	}
	
}