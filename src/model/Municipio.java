package model;

import javax.persistence.Entity;

@Entity
public class Municipio extends DefaultEntity<Municipio> {

	private static final long serialVersionUID = -3706404955364051670L;

	private String nome;

	private Estado estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
