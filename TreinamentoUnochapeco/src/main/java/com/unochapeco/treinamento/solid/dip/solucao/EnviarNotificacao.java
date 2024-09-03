package com.unochapeco.treinamento.solid.dip.solucao;

/**
 * A classe de alto nivel (de negocio) nao conhece a classe de baixo nivel evitando um alto acoplamento no sistema.
 * Agora a classe EnviarNotificacao pode notificar com varios notificadores diferentes.
 */
public class EnviarNotificacao {

	private Notificador notificador;
	
	public void notificar(String mensagem) {
		notificador.notificar(mensagem);
	}
	
}
