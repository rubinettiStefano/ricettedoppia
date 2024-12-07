package com.generation.ricettedoppio.controller.helpers;

import com.generation.ricettedoppio.model.entities.Ricetta;
import com.generation.ricettedoppio.model.repositories.IngredienteRepository;
import com.generation.ricettedoppio.model.repositories.RicettaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	private RicettaRepository rRepo;
	@Autowired
	private IngredienteRepository iRepo;


	@Override
	public List<Ricetta> getAllRecipes()
	{
		return rRepo.findAll();
	}

	@Override
	public List<Ricetta> getAllRecipesFiltrate(String criterio)
	{
		List<Ricetta> ricettas = new ArrayList<>();
		List<Ricetta> all = rRepo.findAll();

		for(Ricetta ricetta : all)
			if(ricetta.getNome().toLowerCase().contains(criterio.toLowerCase()))
				ricettas.add(ricetta);
		return ricettas;
	}
}
