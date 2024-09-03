package com.unochapeco.treinamento.polimorfirmo;

public class PedidoCompra extends Pedido{

	@Override
	public void calcularTotal() {
		System.out.println("calculando pedido de compra");
	}
	
}
