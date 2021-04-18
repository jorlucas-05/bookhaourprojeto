package br.com.ifpe.bookhour;

/**
 * Refer�ncia: http://www.javabeat.net/using-converters-in-jsf/
 * 
 * @author jaindsonvs
 *
 */
public class Celular {
	
	private Integer codigoarea;	
	private Long numero;

	public Celular(Integer codigoarea, Long numero) {
		super();
		this.codigoarea = codigoarea;
		this.numero = numero;
	}


	public Integer getCodigoarea() {
		return codigoarea;
	}

	public void setCodigoarea(Integer codigoarea) {
		this.codigoarea = codigoarea;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
}
