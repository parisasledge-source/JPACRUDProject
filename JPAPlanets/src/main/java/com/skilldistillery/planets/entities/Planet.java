package com.skilldistillery.planets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String color;
	private String description;
	
	@Column(name="orbit_distance_kilometers")
	private long orbitDistanceKilometers;
	
//	@Column(name="mean_temperature_celsius")
//	private int tempCelsius;
//	
//	@Column(name="equatorial_radius_kilometers")
//	private double radiusKilometers;
//	
//	
//	@Column(name="mass_kilograms")
//	private String mass;
//	
//	@Column(name="gravity_metres_per_second_squared")
//	private double gravity;
	
	public Planet() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getOrbitDistanceKilometers() {
		return orbitDistanceKilometers;
	}

	public void setOrbitDistanceKilometers(long orbitDistanceKilometers) {
		this.orbitDistanceKilometers = orbitDistanceKilometers;
	}

//	public int getTempCelsius() {
//		return tempCelsius;
//	}
//	
//	public void setTempCelsius(int tempCelsius) {
//		this.tempCelsius = tempCelsius;
//	}
//	
//	public double getRadiusKilometers() {
//		return radiusKilometers;
//	}
//	
//	public void setRadiusKilometers(double radiusKilometers) {
//		this.radiusKilometers = radiusKilometers;
//	}
//
//	public String getMass() {
//		return mass;
//	}
//
//	public void setMass(String mass) {
//		this.mass = mass;
//	}
//
//	public double getGravity() {
//		return gravity;
//	}
//
//	public void setGravity(double gravity) {
//		this.gravity = gravity;
//	}

	
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", color=" + color + ", description=" + description
				+ ", orbitDistanceKilometers=" + orbitDistanceKilometers + ""
						//+ ", tempCelsius=" + tempCelsius
				//+ ", radiusKilometers=" + radiusKilometers + ", gravity=" + gravity 
				+ "]";
	}

}
