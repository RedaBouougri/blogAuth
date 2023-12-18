package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Entree extends Repas {
	
	private String cuisson;

	public String getCuisson() {
		return cuisson;
	}

	public void setCuisson(String cuisson) {
		this.cuisson = cuisson;
	}
	
	

}
