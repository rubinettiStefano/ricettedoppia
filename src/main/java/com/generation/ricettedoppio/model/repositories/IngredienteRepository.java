package com.generation.ricettedoppio.model.repositories;

import com.generation.ricettedoppio.model.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer>
{
}
