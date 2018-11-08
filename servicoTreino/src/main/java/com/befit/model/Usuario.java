package com.befit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="usuario")
public abstract class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String senha;
	private String login;
	private String nome;
	private String cpf;
	
	
	public Long getId() {
		return id;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
