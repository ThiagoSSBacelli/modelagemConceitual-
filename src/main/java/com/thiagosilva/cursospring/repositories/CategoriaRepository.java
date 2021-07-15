package com.thiagosilva.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagosilva.cursospring.dominio.CategoriaDominio;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDominio, Integer>{

	
	
}
