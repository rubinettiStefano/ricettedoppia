package com.generation.ricettedoppio.controller;

import com.generation.ricettedoppio.controller.helpers.ControllerHelper;
import com.generation.ricettedoppio.model.entities.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/ricette")
public class RicetteRestController
{
	@Autowired
	ControllerHelper ch;

	@GetMapping
	public List<Ricetta> produciJsonRicette()
	{
		List<Ricetta> dati =  ch.getAllRecipes();
		return dati;
	}
}
