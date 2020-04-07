package com.softwareestrategico.prueba.login.models.loginDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.softwareestrategico.prueba.login.models.entity.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

		
	@Query("select u from Usuario u where u.usuario = ?1 and u.clave = ?2")
	public List<Usuario> findByUsername(String usuario, String clave);
}
