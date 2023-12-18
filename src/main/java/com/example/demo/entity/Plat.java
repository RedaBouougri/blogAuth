package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Plat extends Repas {
	
	
	
	private String ingredients;

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	

}
