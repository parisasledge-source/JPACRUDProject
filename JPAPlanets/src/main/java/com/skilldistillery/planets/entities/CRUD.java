package com.skilldistillery.planets.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class CRUD {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Planets");
	
//	@PersistenceContext
//	private EntityManager em;

	
	public Planet findById(int planetId) {
		EntityManager em = emf.createEntityManager();
		return em.find(Planet.class, planetId);
	}

	public List<Planet> findAll() {
		EntityManager em = emf.createEntityManager();
		String jpql = "SELECT p FROM Planet p ";
		return em.createQuery(jpql, Planet.class).getResultList();
	}
	
	public Planet addNewPlanet(String name, String color) {
		EntityManager em = emf.createEntityManager();
		
		Planet p = new Planet();
		p.setName(name);
		p.setColor(color);
		em.persist(p);
		return p;
	}

	public Planet updatePlanet(int planetId, Planet planet) {
		EntityManager em = emf.createEntityManager();
		
		Planet updatePlanet = em.find(Planet.class, planetId);
		
		updatePlanet.setName(planet.getName());
		updatePlanet.setColor(planet.getColor());
		//updatePlanet.setDescription(planet.getDescription());
		
//		em.persist(planet);
//		em.flush();
		return updatePlanet;
	}

	public boolean deletePlanet(int planetId) {
		EntityManager em = emf.createEntityManager();
		boolean isDeleted = false;
		
		Planet planet = em.find(Planet.class, planetId);
		if(planet != null) {
			em.remove(planet);
			em.flush();
			isDeleted = !em.contains(planet);
		}
		return isDeleted;
	}




}
