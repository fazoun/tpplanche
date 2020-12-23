package com.epita.tp2module.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planche {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private double surface; 
	
	private double nombrePlanche;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getSurface() {
		return surface;
	}

	public double getNombrePlanche() {
		return nombrePlanche;
	}

	public void setNombrePlanche(double nombrePlanche) {
		this.nombrePlanche = nombrePlanche;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	} 
	
}
