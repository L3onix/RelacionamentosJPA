package model;

import javax.persistence.Entity;

@Entity
public class Cliente extends DefaultEntity<Cliente> {

	private static final long serialVersionUID = 8672288647132003282L;

	private String profissao;

	private Pessoa pessoa;

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
