package com.softwareestrategico.prueba.autor.models.dao;
import com.softwareestrategico.prueba.autor.models.entity.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorDao extends CrudRepository<Autor, Long> {

}
