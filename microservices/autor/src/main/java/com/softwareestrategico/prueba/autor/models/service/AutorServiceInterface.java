package com.softwareestrategico.prueba.autor.models.service;

import java.util.List;

import com.softwareestrategico.prueba.autor.models.entity.Autor;

public interface AutorServiceInterface {
	public List<Autor> findAll();
	public Autor findById(Long id);
	public Autor save(Autor autor);
	public void deleteById(Long id);			
}
