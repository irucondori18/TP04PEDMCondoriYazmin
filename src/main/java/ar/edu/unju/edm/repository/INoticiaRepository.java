package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Noticia;

@Repository
public interface INoticiaRepository extends CrudRepository<Noticia,Integer>{

}