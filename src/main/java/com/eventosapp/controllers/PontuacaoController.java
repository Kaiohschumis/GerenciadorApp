package com.eventosapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventosapp.models.Pontuacao;
import com.eventosapp.repository.PontuacaoRepository;

@Controller
public class PontuacaoController {

	@Autowired
	private PontuacaoRepository pr;
	
	@RequestMapping(value="/registrarPontuacao", method=RequestMethod.GET)
	public String form(){
		return "pontuacao/formPontuacao";
	}
	
	//Registrar pontuação e validar
	@RequestMapping(value="/regi"
			+ "strarPontuacao", method=RequestMethod.POST)
	public String form(@Valid Pontuacao pontuacao, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/registrarPontuacao";
			
				
		}
		
		
		pr.save(pontuacao);
		attributes.addFlashAttribute("mensagem", "Pontuação registrada!");
		return "redirect:/pontuacoes";
	}
	// @GetMapping("/pontuacoes")
    // public Pontuacao placarMax(@PathVariable("placar") int placar) {
	//	 Pontuacao pontuacoesmax = pr.max(placar);
     //      return placarMax(placar);
    // }
	 
	  
	 
	 
	
	//Caminho das pontuações onde todas estão listadas
	@RequestMapping("/pontuacoes")
	public ModelAndView listaPontuacoes(){
		ModelAndView mv = new ModelAndView("listaPontuacoes");
		Iterable<Pontuacao> pontuacoes = pr.findAll();
		mv.addObject("pontuacoes", pontuacoes);
		return mv;
		
	}
	
	
	
	// endpoint spring maximo das pontuações
	//buscar na base select max
	//retornara a pontuação maior
	
		
	
	}
	
