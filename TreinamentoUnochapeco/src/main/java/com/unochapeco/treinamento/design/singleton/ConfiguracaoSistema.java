package com.unochapeco.treinamento.design.singleton;

import java.time.LocalDateTime;

/**
 * Classe que representa algum tipo de configuracao que tem poucas mudanças de dados no sistema salvo em um banco de dados,
 * na qual é utilizada de forma intesa, milhares de requisições por minutos.
 */
public class ConfiguracaoSistema {

	private LocalDateTime data;
	private String descricao;

	// etc...
	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
