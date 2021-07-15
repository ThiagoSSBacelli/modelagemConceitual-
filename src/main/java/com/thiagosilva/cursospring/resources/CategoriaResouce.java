package com.thiagosilva.cursospring.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosilva.cursospring.dominio.CategoriaDominio;
import com.thiagosilva.cursospring.services.CategoriaService;

//A Resource é o nome padrão de onde é guardado as classes que são controladores Rest. 

@RestController
@RequestMapping(value = "/categorias") // esse é o nome do nosso caminho Categoria Ex: www.checlete.com/categorias
public class CategoriaResouce {

	
	// é necessário associar e requisição a um dos verbos Http

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		CategoriaDominio obj = service.find(id);
				return ResponseEntity.ok().body(obj);
		
	}

}
