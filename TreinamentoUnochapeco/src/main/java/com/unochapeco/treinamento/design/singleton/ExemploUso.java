package com.unochapeco.treinamento.design.singleton;

public class ExemploUso {

	public static void main(String[] args) {
		
		//A instancia de singleton sempre retorna o mesmo objeto.
		ConfiguracaoSistema configuracaoSistema = ConfiguracaoSisitemasSingleton.getInstance().getConfiguracaoSistema();
		
	}
}
