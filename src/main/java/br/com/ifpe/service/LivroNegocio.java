package br.com.ifpe.service;

import java.util.List;

import br.com.ifpe.bookhour.Livro;

public class LivroNegocio {

	LivroDAO livroJDBC = new LivroDAO();
	
	public void inserirLivro(Livro livro){
		livroJDBC.inserir(livro);
	}
	
	public void alterarLivro(Livro livro){
		livroJDBC.alterar(livro);
	}
	
	public void recuperarLivro(Integer id){
		livroJDBC.recuperar(id);
	}
	
	public void deletarLivro(Livro livro){
		livroJDBC.deletar(livro);
	}
	
	public List<Livro> listarTodosLivros(){
		return livroJDBC.listarTodos();
	}
}
