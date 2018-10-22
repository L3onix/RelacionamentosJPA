package model;

import javax.persistence.Entity;

@Entity
public class Fornecedor extends DefaultEntity<Fornecedor> {

	private static final long serialVersionUID = -7917042450982860948L;

	private String contato;

	private String observacao;

	private PessoaJuridica pessoaJuridica;

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}


}
