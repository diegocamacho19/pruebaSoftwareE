package com.softwareestrategico.prueba.login.models.services;

import com.softwareestrategico.prueba.login.models.entity.Usuario;

public interface UsuarioServiceInterface {
	
	public Usuario findByUserAndPassword(String user, String clave);
}
