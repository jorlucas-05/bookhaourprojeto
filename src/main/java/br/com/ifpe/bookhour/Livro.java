package br.com.ifpe.bookhour;

import java.io.Serializable;

public class Livro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idLivro;
	private String titulo;
	private Autor autor;
	
	public Livro() {
	}
	
	public Livro(int idLivro, String titulo, Autor autor) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	
	public void setIdLivro() {
		this.idLivro = idLivro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
