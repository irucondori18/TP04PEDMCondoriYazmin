package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Noticia;
import ar.edu.unju.edm.service.INoticiaService;


@Controller
public class AplicacionController {
	
	@Autowired
	INoticiaService iNoticiaService;
	
	@GetMapping("/inicio")
	public String iniciarAplicacion(){
		
		Noticia unaNoticia = new Noticia(2,null,"Titulo02","Resumen02");
		iNoticiaService.guardarNoticia(unaNoticia);
		return "index";
	}
	
	@GetMapping("/fixture")
	public String mostrarFixture(){
		return "fixture";
		
	}
	
	@GetMapping("/equipos")
	public String mostrarEquipos(){
		return "equipos";
	}
	
}
