package com.befit.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.befit.model.Cliente;
import com.befit.model.Usuario;
import com.befit.repository.ClienteRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public boolean cadastrarCliente(@RequestBody Cliente cliente, HttpServletResponse response) {
		Cliente clienteCadastrado = clienteRepository.save(cliente);
		
		return (clienteCadastrado != null) ? true: false;
	}
	
	@GetMapping
	public List<Usuario> listarClientes() {
		return clienteRepository.findAll();
	}
}
