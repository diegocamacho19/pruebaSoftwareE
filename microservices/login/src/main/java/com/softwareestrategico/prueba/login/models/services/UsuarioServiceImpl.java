package com.softwareestrategico.prueba.login.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwareestrategico.prueba.login.models.entity.Usuario;
import com.softwareestrategico.prueba.login.models.loginDao.UsuarioDao;

@Service
public class UsuarioServiceImpl implements UsuarioServiceInterface{

	@Autowired
	private UsuarioDao usuarioDao;
		
	@Override
	@Transactional(readOnly = true)
	public Usuario findByUserAndPassword(String user, String clave) {		
			List<Usuario> lstUsuario = usuarioDao.findByUsername(user, clave);
		
		return !lstUsuario.isEmpty() ? lstUsuario.get(0) : null;			
	}
	
}
