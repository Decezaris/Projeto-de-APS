package com.befit.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="cliente") 
public class Cliente extends Usuario {
	
	@Embedded
	private Treino treino;

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}
}
