package com.softwareestrategico.prueba.autor.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwareestrategico.prueba.autor.models.dao.AutorDao;
import com.softwareestrategico.prueba.autor.models.entity.Autor;

@Service
public class AutorServiceImpl implements AutorServiceInterface{

	@Autowired
	private AutorDao autorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Autor> findAll() {		
		return (List<Autor>) autorDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Autor findById(Long id) {
		return autorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Autor save(Autor autor) {
		return autorDao.save(autor);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		autorDao.deleteById(id);
		
	}
	

}
