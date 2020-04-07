package com.softwareestrategico.prueba.login.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.softwareestrategico.prueba.login.models.entity.Usuario;
import com.softwareestrategico.prueba.login.models.services.UsuarioServiceInterface;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioServiceInterface usuarioService;
	
	@GetMapping("/usuario/{user}/{clave}")
	public Usuario detalle(@PathVariable String user, @PathVariable String clave) {
		return usuarioService.findByUserAndPassword(user,clave);
	}
}
