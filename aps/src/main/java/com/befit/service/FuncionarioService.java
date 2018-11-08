package com.befit.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;


import com.befit.model.Cliente;
import com.befit.model.Treino;

import com.befit.repository.ClienteRepository;

public class FuncionarioService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private Cliente buscarCliente(String nome) {
		Cliente c = new Cliente();
		c.setNome(nome);
		Example<Cliente> match = Example.of(c);
		
		return clienteRepository.findOne(match);
	}
	
	public String editarTreinoCliente(String nome, Treino treino) {
		
		Cliente cliente = this.buscarCliente(nome);
		
		if(cliente != null) {
			cliente.setTreino(treino);
			return "Treino alterado com sucesso!";
		} else {
			return "Cliente nao existe!";
		}
	}
	
}
