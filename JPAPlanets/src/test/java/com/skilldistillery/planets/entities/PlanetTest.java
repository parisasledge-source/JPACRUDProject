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
	void test_planet_mapping() {
		
		assertNotNull(planet);
		assertEquals("Mercury", planet.getName());
		
	
	}

}
