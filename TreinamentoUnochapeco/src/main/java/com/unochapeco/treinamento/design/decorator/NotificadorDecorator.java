package com.unochapeco.treinamento.design.decorator;

public abstract class NotificadorDecorator extends Notificador{

	private Notificador notificador;

	public NotificadorDecorator(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void send(String message) {
		notificador.send(message);
	}
	
	
}
