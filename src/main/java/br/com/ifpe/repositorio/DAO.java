package br.com.ifpe.repositorio;

import java.util.List;

public interface DAO<T> {

	public void inserir(T d);

    public void alterar(T d);

    public T recuperar(Integer d);

    public void deletar(T d);

    public List<T> listarTodos();
	
}
