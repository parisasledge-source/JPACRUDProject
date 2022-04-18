package com.skilldistillery.planets.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.skilldistillery.planets.entities.Planet;

@Service
@Transactional
public class PlanetDaoJpaImpl implements PlanetDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Planet findById(Integer planetId) {
		
		if (planetId!=null) {
			
			return em.find(Planet.class, planetId);
		}else {
			return null;
		}
		
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
	
	@Override
	public Planet updatePlanet(int planetId, Planet planet) {
		
		Planet updatePlanet = em.find(Planet.class, planetId);
		
		updatePlanet.setName(planet.getName());
		updatePlanet.setColor(planet.getColor());
		//updatePlanet.setDescription(planet.getDescription());
		
//		em.persist(planet);
//		em.flush();
		return updatePlanet;
	}
	
	@Override
	public boolean deletePlanet(int planetId) {
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