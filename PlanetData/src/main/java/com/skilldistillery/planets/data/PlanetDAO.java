package com.skilldistillery.planets.data;

import java.util.List;

import com.skilldistillery.planets.entities.Planet;

public interface PlanetDAO {
	Planet findById(int planetId);

	List<Planet> findAll();
	
	Planet addNewPlanet(String name, String color);

	//Planet updatePlanet(int planetId);

	//Planet deletePlanet(String name, String color);
}
