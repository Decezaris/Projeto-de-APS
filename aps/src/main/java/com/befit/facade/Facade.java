
package com.befit.facade;

import model.resource.*;
import resource.*;
import repository.*;

import java.util.Map;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.data.domain.Example;
//import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Facade { 
    private static Fachada fachadaSingleton = null;
    
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private UsuarioService usuarioRepository;
    
    private ClienteResource clienteResource;
    private UsuarioResource usuarioResource;

   
    private Fachada() {
        this.clienteRepository = new clienteRepository();
        this.clienteResource = new clienteRepository();
        this.usuarioResource = new usuarioRepository();
        this.usuarioService = new UsuarioResource();        
    }

    public static Fachada obterInstancia() {
        if (Fachada.fachadaSingleton == null)
            Fachada.fachadaSingleton = new Fachada();

        return fachadaSingleton;
    }
}

@PostMapping("/login")
public boolean loginSubmit(Model model, @ModelAttribute Cliente cliente) {
    
    clienteRetornado = clienteService.efetuarLogin(cliente);
    
    if(clienteRetornado != null) {
        return true;
    } else {
        return false;
    }
}