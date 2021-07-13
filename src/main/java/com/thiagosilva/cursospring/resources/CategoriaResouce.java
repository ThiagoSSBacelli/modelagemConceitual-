package com.thiagosilva.cursospring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosilva.cursospring.dominio.CategoriaDominio;

//A Resource é o nome padrão de onde é guardado as classes que são controladores Rest. 

@RestController
@RequestMapping(value = "/categorias") // esse é o nome do nosso caminho Categoria Ex: www.checlete.com/categorias
public class CategoriaResouce {

	// é necessário associar e requisição a um dos verbos Http

	@RequestMapping(method = RequestMethod.GET)
	public List<CategoriaDominio> listar() {

		CategoriaDominio cat1 = new CategoriaDominio(1, "Informatica");
		CategoriaDominio cat2 = new CategoriaDominio(2, "Escritorio");

		List<CategoriaDominio> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}

}
