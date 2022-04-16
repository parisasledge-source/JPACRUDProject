package com.skilldistillery.planets.data;

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
	public Planet findById(int planetId) {
		
		return em.find(Planet.class, planetId);
	}

}
