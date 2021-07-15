package com.thiagosilva.cursospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiagosilva.cursospring.dominio.CategoriaDominio;
import com.thiagosilva.cursospring.repositories.CategoriaRepository;

@SpringBootApplication
public class CursospringApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CategoriaDominio cat1 = new CategoriaDominio(null, "Informática");
		CategoriaDominio cat2 = new CategoriaDominio(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
