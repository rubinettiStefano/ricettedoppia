package com.generation.ricettedoppio.model.repositories;

import com.generation.ricettedoppio.model.entities.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RicettaRepository extends JpaRepository<Ricetta, Integer>
{
}
