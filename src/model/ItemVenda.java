package model;

import javax.persistence.Entity;

@Entity
public class ItemVenda extends DefaultEntity<ItemVenda> {

	private static final long serialVersionUID = -7524358878207843800L;

	private int quantidade;

	private double preco;

	private double desconto;

	private Produto produto;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
