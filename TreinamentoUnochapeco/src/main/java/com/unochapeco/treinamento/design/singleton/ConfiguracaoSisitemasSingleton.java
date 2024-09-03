package com.unochapeco.treinamento.design.singleton;

import java.time.LocalDateTime;

/**
 * Classe que representa o padrao singleton, onde que matem uma instancia de ConfiguracaoSistema 
 * guardada na memoria para todo o sistema.
 * 
 * E importante frisar que o objeto mantido pelo singleton deve ser imutável, ou seja, que o cliente do singleton
 * nao consita mudar o estado do objeto mantido pelo singleton, evitando comportamentos inesperados por valores incorretos 
 * mantidos pelo objeto singleton.
 * Essa tecnica pode ser vista com mais detalhes em outro momento.
 * 
 * Dependendo da plataforma Java que esta sendo utilizada para programar, 
 * pode-se utilizar outras formas de se desenvolver um singleton utilizando frameworks de CDI ou EJBs.
 */
public class ConfiguracaoSisitemasSingleton {

	//Objeto que sera mantido pelo singleton
	private ConfiguracaoSistema configuracaoSistema;
	
	//Instancia de um unico singleton para todo o sistema.
	private static final ConfiguracaoSisitemasSingleton INSTANCE = new ConfiguracaoSisitemasSingleton();
	
	//Construtor privato evita do singleton ter mais de uma instancia na memoria.
	private ConfiguracaoSisitemasSingleton() {
		this.configuracaoSistema = carregarConfiguracaoBancoDados();
	}
	
	//Objeto que retorna apenas uma unica instancia do singleton para todo o sistema;
	public static ConfiguracaoSisitemasSingleton getInstance() {
		return INSTANCE;
	}
	
	public ConfiguracaoSistema getConfiguracaoSistema() {
		return configuracaoSistema;
	}
	
	//Metodo que simula a busca da configuracao do banco de dados.
	private static ConfiguracaoSistema carregarConfiguracaoBancoDados() {
		ConfiguracaoSistema configuracaoSistema = new ConfiguracaoSistema();
		configuracaoSistema.setData(LocalDateTime.now());
		configuracaoSistema.setDescricao("configuracao do sistema");
		return configuracaoSistema;
	}
	
}
