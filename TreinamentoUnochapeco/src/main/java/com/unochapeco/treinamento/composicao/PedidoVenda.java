package com.unochapeco.treinamento.composicao;

public class PedidoVenda {

	private String numero;
	private Cliente cliente;

	public PedidoVenda(String numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}
	
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
