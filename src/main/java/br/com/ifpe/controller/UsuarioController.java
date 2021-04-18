package br.com.ifpe.controller;

import java.util.List;

import br.com.ifpe.bookhour.Livro;
import br.com.ifpe.bookhour.Usuario;
import br.com.ifpe.service.LivroNegocio;
import br.com.ifpe.service.UsuarioNegocio;

public class UsuarioController {
	
	UsuarioNegocio usuarioController = new UsuarioNegocio();
	
	public void inserirUsuarioAction(Usuario usuario){
		usuarioController.inserirUsuario(usuario);
	}
	
	public void alterarUsuarioAction(Usuario usuario){
		usuarioController.alterarUsuario(usuario);
	}
	
	public void recuperarUsuarioAction(Integer id){
		usuarioController.recuperarUsuario(id);
	}
	
	public void deletarUsuarioAction(Usuario usuario){
		usuarioController.deletarUsuario(usuario);
	}
	
	public List<Usuario> listarTodosUsuarioAction(){
		return usuarioController.listarTodosUsuarios();
	}

}
