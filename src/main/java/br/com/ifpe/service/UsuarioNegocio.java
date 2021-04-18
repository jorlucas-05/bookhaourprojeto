package br.com.ifpe.service;

import java.util.List;

import br.com.ifpe.bookhour.Usuario;

public class UsuarioNegocio {

	UsuarioDAO usuarioJDBC = new UsuarioDAO(); 
	
	public void inserirUsuario(Usuario usuario){
		usuarioJDBC.inserir(usuario);
	}
	
	public void alterarUsuario(Usuario usuario){
		usuarioJDBC.alterar(usuario);
	}
	
	public void recuperarUsuario(Integer id){
		usuarioJDBC.recuperar(id);
	}
	
	public void deletarUsuario(Usuario usuario){
		usuarioJDBC.deletar(usuario);
	}
	
	public List<Usuario> listarTodosUsuarios(){
		return usuarioJDBC.listarTodos();
	}
	
}
