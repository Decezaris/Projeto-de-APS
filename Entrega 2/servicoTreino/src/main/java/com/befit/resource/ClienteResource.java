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
import org.springframework.web.bind.annotation.RequestParam;

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
	@Autowired
	private ClienteRepository clienteRepository;
	/*
	@PostMapping("/avaliarTreino")
	public void avaliarTreino(@RequestParam Map<String, String> parametros) {
		
		String grupamento = parametros.get("grupamento");
		String nota = parametros.get("nota");
		
		int notaInt = Integer.parseInt(nota);
		
		clienteService.avaliarTreino(grupamento.charAt(0), notaInt);
	}*/
	
	/*
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	@ResponseBody
	public String efetuarLogin(@RequestParam Map<String, String> parametros, Model model) {
		model.addAttribute("cliente", new Cliente());
        return "login";
		Usuario u = new Cliente();
		u.setLogin(parametros.get("login"));
		u.setSenha(parametros.get("senha"));
		model.addAttribute("name", u.getCpf());
		if (clienteService.efetuarLogin(u)) {
			model.addAttribute("appName", appName);
			return "login";
		} else {
			return "";
		}
	}*/
	
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
	
	@GetMapping("/avaliarTreino")
    public String avaliarTreinoGet(Model model) {
        model.addAttribute("treino", new Treino());
        return "avaliarTreino";
    }
	
	
	@PostMapping("/avaliarTreino")
    public void avaliarTreinoPost(@ModelAttribute Treino treino) {
		
		Treino treinoTemp = new Treino();
		
		if(treino.getAvaliacaoTreinoA() != null) {
			treinoTemp.setAvaliacaoTreinoA(treino.getAvaliacaoTreinoA());
		}
		
		if(treino.getAvaliacaoTreinoB() != null) {
			treinoTemp.setAvaliacaoTreinoB(treino.getAvaliacaoTreinoB());
		}
		
		if(treino.getAvaliacaoTreinoC() != null) {
			treinoTemp.setAvaliacaoTreinoC(treino.getAvaliacaoTreinoC());
		}
		
		Cliente c1 = (Cliente)clienteRetornado;
		c1.setTreino(treinoTemp);
		
		System.out.println(c1.getTreino().getAvaliacaoTreinoB());
		
		clienteRepository.save(c1);
    }
}




