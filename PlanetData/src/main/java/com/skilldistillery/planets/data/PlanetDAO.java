package com.skilldistillery.planets.data;

import com.skilldistillery.planets.entities.Planet;

public interface PlanetDAO {
	Planet findById(int planetId);
	
}
