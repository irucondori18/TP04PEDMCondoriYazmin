package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Noticia;
import ar.edu.unju.edm.service.INoticiaService;


@Controller
public class AplicacionController {
	
	@Autowired
	INoticiaService iNoticiaService;
	@Autowired
	Noticia unaNoticia;
	
	@GetMapping("/inicio")
	public String iniciarAplicacion(Model model){
		
//		LocalDate fecha = LocalDate.parse("2020-06-16");
//		unaNoticia.setFecha(fecha);
//		unaNoticia.setResumen("Resumen01");
//		unaNoticia.setTitulo("Titulo01");
//		iNoticiaService.guardarNoticia(unaNoticia);
		
		//model.addAttribute("noticiaDeLaVista",unaNoticia);
		model.addAttribute("todasLasNoticias",iNoticiaService.buscarTodasNoticias());
		//model.addAttribute("formTab","active");
		
		return "index";
	}
	
	@GetMapping("/agregarNoticia")
	public String crearNoticia(Model model){
		model.addAttribute("noticiaDelForm",unaNoticia);
		return "noticiaForm";
	}
	
	@PostMapping("/agregarNoticia")
	public String crearNoticia(@ModelAttribute("noticiaDelForm") Noticia noticia, Model model) {
		try{
			iNoticiaService.guardarNoticia(noticia);
		} catch(Exception e){
			model.addAttribute("formNoticiaErrorMessage",e.getMessage());
		}
		return "redirect:/agregarNoticia";
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
