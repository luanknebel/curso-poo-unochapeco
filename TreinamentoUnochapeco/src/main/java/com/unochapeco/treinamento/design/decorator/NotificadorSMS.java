package com.unochapeco.treinamento.design.decorator;

public class NotificadorSMS extends NotificadorDecorator{

	public NotificadorSMS(Notificador notificador) {
		super(notificador);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		sendSMS(message);
	}

	private void sendSMS(String message) {
		System.out.println("enviando sms");
	}
}
