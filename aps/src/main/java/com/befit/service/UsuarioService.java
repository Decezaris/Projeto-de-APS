package com.befit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;

import com.befit.model.Cliente;
import com.befit.model.Funcionario;
import com.befit.model.Usuario;
import com.befit.repository.UsuarioRepository;

@SpringBootApplication
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario efetuarLogin(Usuario usuario) {

		Usuario userReturn;
		
		if(usuario instanceof Cliente) {
			userReturn = new Cliente();
			userReturn.setLogin(usuario.getLogin());
			userReturn.setSenha(usuario.getSenha());
		} else {
			userReturn = new Funcionario();
			userReturn.setLogin(usuario.getLogin());
			userReturn.setSenha(usuario.getSenha());
		}
		
		Example<Usuario> match = Example.of(userReturn);
		

		return usuarioRepository.findOne(match);
	}
}
