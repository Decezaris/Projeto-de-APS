package com.befit.resource;


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
//import org.springframework.web.bind.annotation.RequestParam;

import com.befit.model.Cliente;
import com.befit.model.Treino;
import com.befit.model.Usuario;
import com.befit.repository.ClienteRepository;
import com.befit.service.ClienteService;


@Controller
public class ClienteResource {

	private Usuario clienteRetornado;
	
	@Autowired
	private ClienteService clienteService;
	//@Autowired
	//private ClienteRepository clienteRepository;
	
	@GetMapping("/login")
    public String efetuarLogin(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "login";
    }
	
	@PostMapping("/login")
    public String loginSubmit(Model model, @ModelAttribute Cliente cliente) {
		
		clienteRetornado = clienteService.efetuarLogin(cliente);
		
		if (clienteRetornado != null) {
			model.addAttribute("nome", this.clienteRetornado.getNome());
			model.addAttribute("cliente", this.clienteRetornado);
			return "index";
		} else {
			return "login";
		}
    }
}




