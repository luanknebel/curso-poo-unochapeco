package com.unochapeco.treinamento.classes;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	protected void trabalhar(String nomeTrabalho) {
		System.out.println("trabalhando em " + nomeTrabalho );
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
