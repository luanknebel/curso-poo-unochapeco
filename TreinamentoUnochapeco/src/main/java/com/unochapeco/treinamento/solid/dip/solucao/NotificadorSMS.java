package com.unochapeco.treinamento.solid.dip.solucao;

public class NotificadorSMS implements Notificador{

	@Override
	public void notificar(String mensagem) {
		System.out.println("enviando mensagem pelo Teams");
	}
	
}
