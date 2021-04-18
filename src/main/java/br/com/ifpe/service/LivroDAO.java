package br.com.ifpe.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ifpe.bookhour.Autor;
import br.com.ifpe.bookhour.Livro;
import br.com.ifpe.repositorio.iRepositorioLivro;

public class LivroDAO implements iRepositorioLivro {

	List<Livro> repositorioLivros = new ArrayList<>();
	
	@Override
	public void inserir(Livro d) {
		
		this.repositorioLivros.add(d);
		
	}

	@Override
	public void alterar(Livro d) {
		
		for (Livro livro : repositorioLivros) {
			if(livro.getTitulo().equals(d.getTitulo()) && (livro.getAutor().equals(d.getAutor()) && livro.getIdLivro() == d.getIdLivro())) {
				this.repositorioLivros.set(livro.hashCode(), d);
			}
		}
		System.out.println("Livro não encontrato! Impossível de ser alterado");
	}

	@Override
	public Livro recuperar(Integer d) {
		
		Livro livroEncontrado = null;
		
		for (Livro livro : repositorioLivros) {
			if(livro.getIdLivro() == d) {
				livroEncontrado = livro;
				
			}
		}
		
		return livroEncontrado;
	}

	@Override
	public void deletar(Livro d) {
		
		for (Livro livro : repositorioLivros) {
			if(livro.getTitulo().equals(d.getTitulo()) && (livro.getAutor().equals(d.getAutor()) && livro.getIdLivro() == d.getIdLivro())) {
				repositorioLivros.remove(d);
			}
		}
		
	}

	@Override
	public List<Livro> listarTodos() {
		
		return repositorioLivros;
	}

	
}
