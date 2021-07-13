package com.thiagosilva.cursospring.dominio;

import java.io.Serializable;
import java.util.Objects;

public class CategoriaDominio implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	public CategoriaDominio() {
	}

	public CategoriaDominio(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// Get e Set são métodos de acessos para esses atributos (id e nome)

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Para que dois hobjetos possam ser comparados pelo seu conteúdo e não pelo
	// ponteiro de memória o objeto tem que ter a implementação dos métodos hasCode
	// e equals, que são operações para comprar os objetos por valor.

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaDominio other = (CategoriaDominio) obj;
		return Objects.equals(id, other.id);
	}

}
