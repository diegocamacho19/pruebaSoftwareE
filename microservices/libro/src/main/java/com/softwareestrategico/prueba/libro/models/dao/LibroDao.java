package com.softwareestrategico.prueba.libro.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.softwareestrategico.prueba.libro.models.entity.Libro;

public interface LibroDao extends CrudRepository<Libro, Long> {

}
