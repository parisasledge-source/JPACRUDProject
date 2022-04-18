package com.skilldistillery.planets.data;

import java.util.List;

import com.skilldistillery.planets.entities.Planet;

public interface PlanetDAO {
	Planet findById(Integer planetId);

	List<Planet> findAll();
	
	Planet addNewPlanet(String name, String color);

	Planet updatePlanet(int i, Planet planet);

	boolean deletePlanet(int planetId);

}