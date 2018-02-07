package com.car.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.car.service.CarService;
import com.car.domain.Car;

@RestController
@RequestMapping(value="/cars")
public class CarController {
	@Autowired 
	private CarService carService;
	
	@PostMapping
	public Car createCar(@RequestBody Car car) {
		return carService.create(car);
	}
	
	//Get list of unrented car
	@GetMapping
	public List<Car> listOfCars() {
		return carService.getUnrentedCar();
	}
	
	@PutMapping(value="/{plateNumber}")
	public Car rentOrGiveBack(@PathVariable("plateNumber")String plateNumber) {
		return carService.update(plateNumber);
	}
}