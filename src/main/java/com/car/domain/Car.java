package com.car.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the type database table.
 * 
 */
@Entity
@Table(name="car")
@NamedQuery(name="Car.findAll", query="SELECT c FROM Car c")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="car_id", unique=true, nullable=false)
	private int id;

	@Column(length=200)
	private String description;

	@Column
	private boolean rented = false;

	public Car() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int typeId) {
		this.id = typeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getRented() {
		return this.rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}
	
}