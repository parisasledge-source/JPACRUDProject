package com.skilldistillery.planets.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CRUDTest {
	
	private CRUD crud;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		crud = new CRUD();
	}

	@AfterEach
	void tearDown() throws Exception {
		crud = null;
	}

	@Test
	void test_getRangeOfPlanets() {
		List<Planet> planets = crud.findAll();
		assertNotNull(planets);
		assertTrue(planets.size() > 0);
		assertEquals(8, planets.size());
	}


}
