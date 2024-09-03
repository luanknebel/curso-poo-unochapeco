package com.unochapeco.treinamento.solid.dip.solucao;

public class NotificadorTeams implements Notificador{

	@Override
	public void notificar(String mensagem) {
		System.out.println("enviando mensagem de sms");
	}
	
}
