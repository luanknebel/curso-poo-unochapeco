package com.unochapeco.treinamento.solid.dip.problema;

/**
 * a classe de alto nivel (de negocio) conhece a classe de baixo nivel (api do sms) criando um alto acoplamento no sistema
 */
public class EnviarNotificacao {

	public void notificar(String mensagem) {
		new NotificadorSMS().notificar(mensagem);
	}
	
}
