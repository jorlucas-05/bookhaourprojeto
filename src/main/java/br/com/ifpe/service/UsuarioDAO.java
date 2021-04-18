package br.com.ifpe.service;

import java.util.ArrayList;
import java.util.List;

import br.com.ifpe.bookhour.Livro;
import br.com.ifpe.bookhour.Usuario;
import br.com.ifpe.repositorio.iRepositorioUsuario;

public class UsuarioDAO implements iRepositorioUsuario {

	List<Usuario> repositorioUsuarios = new ArrayList<>();
	
	@Override
	public void inserir(Usuario d) {
		
		this.repositorioUsuarios.add(d);
		
	}

	@Override
	public void alterar(Usuario d) {
		
		for (Usuario usuario : repositorioUsuarios) {
			if((usuario.getIdUsuario() == d.getIdUsuario()) && (usuario.getnomedeusuario().equals(d.getnomedeusuario()))) {
				this.repositorioUsuarios.set(usuario.hashCode(), d);
			}
		}
		System.out.println("Livro não encontrato! Impossível de ser alterado");
		
	}

	@Override
	public Usuario recuperar(Integer d) {
		
		Usuario usuarioEncontrado = null;
		
		for (Usuario usuario : repositorioUsuarios) {
			if(usuario.getIdUsuario() == d) {
				usuarioEncontrado = usuario;
				
			}
		}
		
		return usuarioEncontrado;
	}

	@Override
	public void deletar(Usuario d) {
		
		for (Usuario usuario : repositorioUsuarios) {
			if((usuario.getIdUsuario() == d.getIdUsuario()) && (usuario.getnomedeusuario().equals(d.getnomedeusuario()))) {
				repositorioUsuarios.remove(d);
			}
		}
		
	}

	@Override
	public List<Usuario> listarTodos() {
		
		return repositorioUsuarios;
	}

}
