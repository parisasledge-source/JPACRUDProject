package com.skilldistillery.planets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.planets.data.PlanetDAO;
import com.skilldistillery.planets.entities.Planet;

@Controller
public class PlanetController {

	@Autowired
	private PlanetDAO dao;

//	@RequestMapping(path= {"/", "home.do"})
//	public String home(Model model) {
//		model.addAttribute("DEBUG", dao.findById(1));
//		return "home";
//	}

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		List<Planet> planets = dao.findAll();
		model.addAttribute("planets", planets);
		// return "WEB-INF/home.jsp";
		return "home";
	}

	@RequestMapping(path = "getPlanet.do")
	public String displayPlanet(Integer id, Model model) {
		Planet planet = dao.findById(id);
		model.addAttribute("planet", planet);
		return "display";
	}

	@RequestMapping(path = "addPlanet.do")
	public String addNewPlanet(String name, String color, Model model) {
		Planet planet = dao.addNewPlanet(name, color);
		model.addAttribute("planet", planet);
		return "display";
	}

	@RequestMapping(path = "updatePlanet.do",method = RequestMethod.POST)
	public String updatePlanet(Planet planet, Model model) {
		Planet newPlanet = dao.updatePlanet(9, planet);
		model.addAttribute("planet", newPlanet);
		return "display";
	}

	/*
	 * @RequestMapping(path = "updatefilm.do", method = RequestMethod.POST) public
	 * ModelAndView updatefilm( Film film, @RequestParam("filmId") String filmId) {
	 * // public ModelAndView updatefilm( Film film, @RequestParam("filmId")) {
	 * ModelAndView mv = new ModelAndView(); Film newFilm = filmDao.updateFilm(film,
	 * Integer.parseInt(filmId)); mv.addObject("film", newFilm);
	 * mv.setViewName("WEB-INF/film-updated.jsp"); return mv;
	 * 
	 * }
	 */

//	@RequestMapping(path="deletePlanet.do")
//	public String deletePlanet(String name, String color, Model model) {
//		Planet planet = dao.deletePlanet(name, color);
//		model.addAttribute("planet", planet);
//		return "display";
//	}

}
