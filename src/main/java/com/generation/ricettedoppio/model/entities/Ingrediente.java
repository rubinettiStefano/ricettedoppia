package com.generation.ricettedoppio.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingrediente extends BaseEntity
{
	private String nome;

	@JsonIgnore
	@ManyToMany(mappedBy = "ingredienti")
	private List<Ricetta> ricette = new ArrayList<Ricetta>();

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public List<Ricetta> getRicette()
	{
		return ricette;
	}

	public void setRicette(List<Ricetta> ricette)
	{
		this.ricette = ricette;
	}
}
