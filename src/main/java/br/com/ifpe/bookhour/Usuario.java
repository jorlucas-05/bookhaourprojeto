package br.com.ifpe.bookhour;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private String Nomedeusuario;
	private int Senha;
	private int Confirmarsenha;
	private String Email;
	private String Cidade;
	private String Estado;
	private String Pais;
	private Celular valor;
	private Date Datadenascimento;
	private String Estadocivil;
	private String Sexo;
	private String numero;
	private String numero2;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getnomedeusuario() {
		return Nomedeusuario;
	}

	public void setnomedeusuario(String Nomedeusuario) {
		this.Nomedeusuario = Nomedeusuario;
	}

	public int getSenha() {
		return Senha;
	}

	public void setsenha(int Senha) {
		this.Senha = Senha;
	}

	public int getconfirmarsenha() {
		return Confirmarsenha;
	}

	public void setconfirmarsenha(int Confirmarsenha) {
		this.Confirmarsenha = Confirmarsenha;
	}

	public String getemail() {
		return Email;
	}

	public void setemail(String Email) {
		this.Email = Email;
	}

	public String getcidade() {
		return Cidade;
	}

	public void setcidade(String Cidade) {
		this.Cidade = Cidade;
	}

	public String getestado() {
		return Estado;
	}

	public void setestado(String Estado) {
		this.Estado = Estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String Pais) {
		this.Pais = Pais;
	}

	public Celular getvalor() {
		return valor;
	}

	public void setvalor(Celular valor) {
		this.valor = valor;
	}

	public Date getdatadenascimento() {
		return Datadenascimento;
	}

	public void setdatadenascimento(Date Datadenascimento) {
		this.Datadenascimento = Datadenascimento;
	}

	public String getestadocivil() {
		return Estadocivil;
	}

	public void setestadocivil(String Estadocivil) {
		this.Estadocivil = Estadocivil;
	}

	public String getsexo() {
		return Sexo;
	}

	public void setsexo(String Sexo) {
		this.Sexo = Sexo;
	}

	public String getnumero() {
		return numero;
	}

	public void setnumero(String numero) {
		this.numero = numero;
	}

	public String getnumero2() {
		return numero2;
	}

	public void setnumero2(String numero2) {
		this.numero2 = numero2;
	}

	public Usuario(int idUsuario, String nomedeusuario, int senha, int confirmarsenha, String email, String cidade,
			String estado, String pais, Celular valor, Date datadenascimento, String estadocivil, String sexo,
			String numero, String numero2) {
		super();
		this.idUsuario = idUsuario;
		Nomedeusuario = nomedeusuario;
		Senha = senha;
		Confirmarsenha = confirmarsenha;
		Email = email;
		Cidade = cidade;
		Estado = estado;
		Pais = pais;
		this.valor = valor;
		Datadenascimento = datadenascimento;
		Estadocivil = estadocivil;
		Sexo = sexo;
		this.numero = numero;
		this.numero2 = numero2;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cidade == null) ? 0 : Cidade.hashCode());
		result = prime * result + Confirmarsenha;
		result = prime * result + ((Datadenascimento == null) ? 0 : Datadenascimento.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Estadocivil == null) ? 0 : Estadocivil.hashCode());
		result = prime * result + ((Nomedeusuario == null) ? 0 : Nomedeusuario.hashCode());
		result = prime * result + ((Pais == null) ? 0 : Pais.hashCode());
		result = prime * result + Senha;
		result = prime * result + ((Sexo == null) ? 0 : Sexo.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((numero2 == null) ? 0 : numero2.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Usuario other = (Usuario) obj;
		if (Cidade == null) {
			if (other.Cidade != null)
				return false;
		} else if (!Cidade.equals(other.Cidade))
			return false;
		if (Confirmarsenha != other.Confirmarsenha)
			return false;
		if (Datadenascimento == null) {
			if (other.Datadenascimento != null)
				return false;
		} else if (!Datadenascimento.equals(other.Datadenascimento))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Estadocivil == null) {
			if (other.Estadocivil != null)
				return false;
		} else if (!Estadocivil.equals(other.Estadocivil))
			return false;
		if (Nomedeusuario == null) {
			if (other.Nomedeusuario != null)
				return false;
		} else if (!Nomedeusuario.equals(other.Nomedeusuario))
			return false;
		if (Pais == null) {
			if (other.Pais != null)
				return false;
		} else if (!Pais.equals(other.Pais))
			return false;
		if (Senha != other.Senha)
			return false;
		if (Sexo == null) {
			if (other.Sexo != null)
				return false;
		} else if (!Sexo.equals(other.Sexo))
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (numero2 == null) {
			if (other.numero2 != null)
				return false;
		} else if (!numero2.equals(other.numero2))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	
}
