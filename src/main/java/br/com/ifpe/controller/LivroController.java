package br.com.ifpe.controller;

import java.util.List;

import br.com.ifpe.bookhour.Livro;
import br.com.ifpe.service.LivroNegocio;

public class LivroController {

	LivroNegocio livroController = new LivroNegocio();
	
	public void inserirLivroAction(Livro livro){
		livroController.inserirLivro(livro);
	}
	
	public void alterarLivroAction(Livro livro){
		livroController.alterarLivro(livro);
	}
	
	public void recuperarLivroAction(Integer id){
		livroController.recuperarLivro(id);
	}
	
	public void deletarLivroAction(Livro livro){
		livroController.deletarLivro(livro);
	}
	
	public List<Livro> listarTodosLivroAction(){
		return livroController.listarTodosLivros();
	}
}
