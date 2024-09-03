package com.unochapeco.treinamento.design.decorator;

public class NotificadorSlack extends NotificadorDecorator{

	public NotificadorSlack(Notificador notificador) {
		super(notificador);
	}

	@Override
	public void send(String message) {
		super.send(message);
		sendSlack(message);
	}

	private void sendSlack(String message) {
		System.out.println("enviando mensagem slack");
	}
	
}
