package com.unochapeco.treinamento.solid.dip.solucao;

public class NotificadorSlack implements Notificador{

	@Override
	public void notificar(String mensagem) {
		System.out.println("enviando mensagem pelo slack");
	}
	
}
