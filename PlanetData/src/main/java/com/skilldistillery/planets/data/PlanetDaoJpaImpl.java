package com.skilldistillery.planets.data;

import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mysql.cj.xdevapi.Statement;
import com.skilldistillery.planets.entities.Planet;

@Service
@Transactional
public class PlanetDaoJpaImpl implements PlanetDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Planet findById(int planetId) {
		
		return em.find(Planet.class, planetId);
	}

	@Override
	public List<Planet> findAll() {
		String jpql = "SELECT p FROM Planet p ";
		return em.createQuery(jpql, Planet.class).getResultList();
	}
	
	@Override
	public Planet addNewPlanet(String name, String color) {
		
		Planet p = new Planet();
		p.setName(name);
		p.setColor(color);
		em.persist(p);
		return p;
	}
	
//	@Override
//	public Planet updatePlanet(int planetId) {
//		
//		Planet p = em.find(Planet.class, planetId);
//		p.setName(p.getName());
//		
//		return p;
//	}
	

	
	
//	public boolean deletePlanet(int planetId) {
//		boolean isDeleted = false;
//		Planet planet = em.find(Planet.class, planetId);
//		if(planet != null) {
//			em.remove(planet);
//		}
//		isDeleted = !em.contains(planet);
//		
//		return isDeleted;
//	}



}
