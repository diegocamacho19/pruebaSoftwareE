package com.softwareestrategico.prueba.libro.models.service;

import java.util.List;

import com.softwareestrategico.prueba.libro.models.entity.Libro;

public interface LibroServiceInterface {
	public List<Libro> findAll();
	public Libro findById(Long id);
	public Libro save(Libro autor);
	public void deleteById(Long id);			
}
