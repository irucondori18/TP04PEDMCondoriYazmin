package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Noticia;
import ar.edu.unju.edm.repository.INoticiaRepository;

@Service
public class INoticiaServiceImp implements INoticiaService{

	@Autowired
	INoticiaRepository iNoticiaRepository;
	
	@Override
	public void guardarNoticia(Noticia unaNoticia) {
		// TODO Auto-generated method stub
		iNoticiaRepository.save(unaNoticia);
		
	}

	@Override
	public Noticia buscarNoticia(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Noticia> buscarTodasNoticias() {
		// TODO Auto-generated method stub
		return iNoticiaRepository.findAll();
	}

	
	
}
