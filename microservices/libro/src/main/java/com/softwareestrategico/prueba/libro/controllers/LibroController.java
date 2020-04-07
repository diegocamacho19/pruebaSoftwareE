package com.softwareestrategico.prueba.libro.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.softwareestrategico.prueba.libro.models.entity.Libro;
import com.softwareestrategico.prueba.libro.models.service.LibroServiceInterface;


@RestController
@CrossOrigin(origins = "*")
public class LibroController {
	@Autowired
	private LibroServiceInterface libroService;
	
	@GetMapping("/listar")
	public List<Libro> listar() {
		return libroService.findAll().stream().map(libro -> {
			return libro;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/consultar/{id}")
	public Libro detalle(@PathVariable Long id) throws Exception {
		Libro libro = libroService.findById(id);
		return libro;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Libro crear(@RequestBody Libro libro) {
		return libroService.save(libro);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Libro editar(@RequestBody Libro libro, @PathVariable Long id) {
		Libro libroDb = libroService.findById(id);
		libroDb.setNombre(libro.getNombre());
		return libroService.save(libroDb);
	}
}
