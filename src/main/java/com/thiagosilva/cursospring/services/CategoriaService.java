package com.thiagosilva.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosilva.cursospring.dominio.CategoriaDominio;
import com.thiagosilva.cursospring.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // Responsável por instanciar a dependência automaticamente do Spring
	private CategoriaRepository repo;

	public CategoriaDominio find(Integer id) {
		Optional<CategoriaDominio> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
 