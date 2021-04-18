package br.com.ifpe.bookhour;

import java.util.List;

public class Autor {
	
	private String nome;
	private List<Livro> livros;
	
	public Autor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setlivros(List<Livro> livros) {
		this.livros = livros;
	}

}
