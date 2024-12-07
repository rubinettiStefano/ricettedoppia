package com.generation.ricettedoppio.controller;

import com.generation.ricettedoppio.controller.helpers.ControllerHelper;
import com.generation.ricettedoppio.model.entities.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/webapp/ricette")
public class RicetteController
{
	@Autowired
	ControllerHelper ch;

	//dato che il verbo è GET, viene gestita dal GetMapping
	@GetMapping
	public String mandaIndietroPaginaTutteRicette(Model model)
	{
		List<Ricetta> dati =  ch.getAllRecipes();
		model.addAttribute("ricette",dati);
		return "tutteRicette";
	}

	@PostMapping
	public String mandaIndietroPaginaTutteRicetteFiltrate(@RequestParam String criterio, Model model)
	{
		List<Ricetta> dati =  ch.getAllRecipesFiltrate(criterio);
		model.addAttribute("ricette",dati);
		return "tutteRicette";
	}
}
