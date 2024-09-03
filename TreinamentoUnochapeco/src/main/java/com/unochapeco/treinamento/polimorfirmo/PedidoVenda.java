package com.unochapeco.treinamento.polimorfirmo;

public class PedidoVenda extends Pedido{

	@Override
	public void calcularTotal() {
		System.out.println("calculando pedido de venda");
	}
	
}
