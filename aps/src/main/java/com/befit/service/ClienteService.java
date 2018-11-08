package com.befit.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.befit.model.Treino;

@SpringBootApplication
public class ClienteService extends UsuarioService{
	
	Treino treino;
	
	public void avaliarTreino(char grupamento, int nota) {
		switch (grupamento) {
			case 'A': 
				treino.setAvaliacaoTreinoA(nota);
				break;
			case 'B': 
				treino.setAvaliacaoTreinoB(nota);
				break;
			case 'C':
				treino.setAvaliacaoTreinoC(nota);
				break;
		}
	}
}
