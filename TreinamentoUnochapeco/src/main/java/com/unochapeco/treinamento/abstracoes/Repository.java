package com.unochapeco.treinamento.abstracoes;

public abstract class Repository {
	
	public void salvar(Modelo modelo) {
		System.out.println("salvando modelo " + modelo.getClass().getSimpleName());
	}
	
	public void excluir(Modelo modelo) {
		System.out.println("excluindo modelo " + modelo.getClass().getSimpleName());
	}
	
	public void atualizar(Modelo modelo) {
		System.out.println("atualizando modelo " + modelo.getClass().getSimpleName());
	}	
	
}
