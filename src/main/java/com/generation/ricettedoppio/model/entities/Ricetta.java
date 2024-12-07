package com.generation.ricettedoppio.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ricetta extends BaseEntity
{
	private String nome, descrizione, tipo;
	private int tempo, livello;

	@ManyToMany
	@JoinTable(
			name = "ricetta_to_ingrediente",
			joinColumns = @JoinColumn(name = "ricetta_id"),
			inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
	)
	private List<Ingrediente> ingredienti = new ArrayList<Ingrediente>();

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public int getTempo()
	{
		return tempo;
	}

	public void setTempo(int tempo)
	{
		this.tempo = tempo;
	}

	public int getLivello()
	{
		return livello;
	}

	public void setLivello(int livello)
	{
		this.livello = livello;
	}

	public List<Ingrediente> getIngredienti()
	{
		return ingredienti;
	}

	public void setIngredienti(List<Ingrediente> ingredienti)
	{
		this.ingredienti = ingredienti;
	}
}
