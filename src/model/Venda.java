package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Venda extends DefaultEntity<Venda> {

	private static final long serialVersionUID = -2642581266924811232L;

	private Date data;

	private double totalDesconto;

	private double totalVenda;

	private Cliente cliente;

	private Funcionario funcionario;

	private List<ItemVenda> itemVenda;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTotalDesconto() {
		return totalDesconto;
	}

	public void setTotalDesconto(double totalDesconto) {
		this.totalDesconto = totalDesconto;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public List<ItemVenda> getItemVenda() {
		return itemVenda;
	}

	public void setItemVenda(List<ItemVenda> itemVenda) {
		this.itemVenda = itemVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


}
