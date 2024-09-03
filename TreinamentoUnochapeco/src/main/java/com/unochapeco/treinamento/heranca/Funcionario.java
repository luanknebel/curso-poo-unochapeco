package com.unochapeco.treinamento.heranca;

import java.math.BigDecimal;

public class Funcionario {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return BigDecimal.ZERO;
	}

}
