package com.befit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.befit.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
