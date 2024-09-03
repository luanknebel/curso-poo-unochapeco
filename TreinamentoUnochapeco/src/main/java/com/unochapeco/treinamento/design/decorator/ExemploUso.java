package com.unochapeco.treinamento.design.decorator;

public class ExemploUso {
	
	public static void main(String[] args) {
		Notificador notificador = new Notificador();
		
		NotificadorSMS notificadorSMS = new NotificadorSMS(notificador);
		NotificadorSlack notificadorSlack = new NotificadorSlack(notificadorSMS);
		
		notificadorSlack.send("teste");
	}
	
}
