package com.dra.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dra.frontend.model.Compromisso;
import com.dra.frontend.service.CompromissoService;

import ch.qos.logback.core.model.Model;



@Controller
@RequestMapping("/compromisso")
public class CompromissoController {

    @Autowired
    CompromissoService compromissoService;
    
    
    
    @GetMapping("/novo")
	public String novoCompromisso(Compromisso compromisso) {
		return "novoCompromisso";
	}
    
    @GetMapping
	public String listaCompromisso(Model model) {
		
		model.addAttribute("Compromisso", compromissoService.getCompromisso());
		return "listaCompromisso";
		
	}
    
}
