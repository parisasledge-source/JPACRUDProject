package com.skilldistillery.planets.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanetTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Planet planet;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	    emf = Persistence.createEntityManagerFactory("JPAPlanets");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	    emf.close();
	}
	
	@BeforeEach
	void setUp() throws Exception {
	    em = emf.createEntityManager();
	    planet = em.find(Planet.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
	    em.close();
	    planet = null;
	}


	@Test
	void test_planet_entity_mapping() {
		
//		mysql> SELECT id, name, color, orbit_distance_kilometers, mean_temperature_celsius, equatorial_radius_kilometers FROM planet WHERE id = 1;
//		+----+---------+-------+---------------------------+--------------------------+------------------------------+
//		| id | name    | color | orbit_distance_kilometers | mean_temperature_celsius | equatorial_radius_kilometers |
//		+----+---------+-------+---------------------------+--------------------------+------------------------------+
//		|  1 | Mercury | Grey  |                  57909227 |                      167 |                      2439.70 |
//		+----+---------+-------+---------------------------+--------------------------+------------------------------+
//		1 row in set (0.00 sec)
//
//		mysql> SELECT id, description FROM planet WHERE id = 1;
//		+----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
//		| id | description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
//		+----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
//		|  1 | The smallest planet in our solar system, Mercury is only slightly larger than Earth's Moon. It is the closest planet to the Sun, but it’s actually not the hottest. Venus is hotter.
//		Along with Venus, Earth, and Mars, Mercury is one of the rocky planets. It has a solid surface that is covered with craters like our Moon. It has a thin atmosphere, and it doesn’t have any moons. Mercury spins slowly compared to Earth, so one day lasts a long time. But a year on Mercury goes fast. Because it’s the closest planet to the sun.       |
//		+----+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
//		1 row in set (0.00 sec)
//
//		mysql> 

		
		assertNotNull(planet);
		assertEquals("Mercury", planet.getName());
		assertEquals("Grey", planet.getColor());
		assertEquals("The smallest planet in our solar system, Mercury is only slightly larger than Earth's Moon. It is the closest planet to the Sun, but it’s actually not the hottest. Venus is hotter.\n"
				+ "Along with Venus, Earth, and Mars, Mercury is one of the rocky planets. It has a solid surface that is covered with craters like our Moon. It has a thin atmosphere, and it doesn’t have any moons. Mercury spins slowly compared to Earth, so one day lasts a long time. But a year on Mercury goes fast. Because it’s the closest planet to the sun.", planet.getDescription());
		assertEquals(57909227, planet.getOrbitDistanceKilometers());
		assertEquals(167, planet.getTempCelsius());
		assertEquals(2439.7, planet.getRadiusKilometers());
		
	
	}

}
