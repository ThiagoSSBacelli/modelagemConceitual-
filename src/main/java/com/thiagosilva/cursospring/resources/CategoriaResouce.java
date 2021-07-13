package com.thiagosilva.cursospring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//A Resource é o nome padrão de onde é guardado as classes que são controladores Rest. 

@RestController
@RequestMapping(value = "/categorias") // esse é o nome do nosso caminho Categoria Ex: www.checlete.com/categorias
public class CategoriaResouce {

	// é necessário associar e requisição a um dos verbos Http

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest esta funcionando!";
	}

}
