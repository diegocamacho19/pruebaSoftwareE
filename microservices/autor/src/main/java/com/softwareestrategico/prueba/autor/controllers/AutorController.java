package com.softwareestrategico.prueba.autor.controllers;

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
import com.softwareestrategico.prueba.autor.models.entity.Autor;
import com.softwareestrategico.prueba.autor.models.service.AutorServiceInterface;


@RestController
@CrossOrigin(origins = "*")
public class AutorController {
	@Autowired
	private AutorServiceInterface autorService;
	
	@GetMapping("/listar")
	public List<Autor> listar() {
		return autorService.findAll().stream().map(autor -> {
			return autor;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/consultar/{id}")
	public Autor detalle(@PathVariable Long id) throws Exception {
		Autor autor = autorService.findById(id);
		return autor;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Autor crear(@RequestBody Autor autor) {
		return autorService.save(autor);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Autor editar(@RequestBody Autor autor, @PathVariable Long id) {
		Autor autorDb = autorService.findById(id);
		autorDb.setNombre(autor.getNombre());
		autorDb.setDireccion(autor.getDireccion());
		autorDb.setCorreo(autor.getCorreo());
		autorDb.setTelefono(autor.getTelefono());
		return autorService.save(autorDb);
	}
}
