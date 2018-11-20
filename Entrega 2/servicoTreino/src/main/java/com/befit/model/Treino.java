package com.befit.model;

import javax.persistence.Embeddable;

@Embeddable
public class Treino {

	private String treinoA;
	private String treinoB;
	private String treinoC;
	private Integer avaliacaoTreinoA;
	private Integer avaliacaoTreinoB;
	private Integer avaliacaoTreinoC;
	
	public String getTreinoA() {
		return treinoA;
	}
	
	public void setTreinoA(String treinoA) {
		this.treinoA = treinoA;
	}
	
	public String getTreinoB() {
		return treinoB;
	}
	
	public void setTreinoB(String treinoB) {
		this.treinoB = treinoB;
	}
	
	public String getTreinoC() {
		return treinoC;
	}
	
	public void setTreinoC(String treinoC) {
		this.treinoC = treinoC;
	}
	
	public Integer getAvaliacaoTreinoA() {
		return avaliacaoTreinoA;
	}
	
	public void setAvaliacaoTreinoA(Integer avaliacaoTreinoA) {
		this.avaliacaoTreinoA = avaliacaoTreinoA;
	}
	
	public Integer getAvaliacaoTreinoB() {
		return avaliacaoTreinoB;
	}
	
	public void setAvaliacaoTreinoB(Integer avaliacaoTreinoB) {
		this.avaliacaoTreinoB = avaliacaoTreinoB;
	}
	
	public Integer getAvaliacaoTreinoC() {
		return avaliacaoTreinoC;
	}
	
	public void setAvaliacaoTreinoC(Integer avaliacaoTreinoC) {
		this.avaliacaoTreinoC = avaliacaoTreinoC;
	}
	
}
