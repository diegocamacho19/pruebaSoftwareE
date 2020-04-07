package com.softwareestrategico.prueba.libro.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwareestrategico.prueba.libro.models.dao.LibroDao;
import com.softwareestrategico.prueba.libro.models.entity.Libro;

@Service
public class LibroServiceImpl implements LibroServiceInterface{

	@Autowired
	private LibroDao libroDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Libro> findAll() {		
		return (List<Libro>) libroDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Libro findById(Long id) {
		return libroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Libro save(Libro autor) {
		return libroDao.save(autor);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		libroDao.deleteById(id);
		
	}
	

}
