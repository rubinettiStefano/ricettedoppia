package com.generation.ricettedoppio.controller.helpers;

import com.generation.ricettedoppio.model.entities.Ricetta;

import java.util.List;

public interface ControllerHelper
{
	List<Ricetta> getAllRecipes();

	List<Ricetta> getAllRecipesFiltrate(String criterio);
}
