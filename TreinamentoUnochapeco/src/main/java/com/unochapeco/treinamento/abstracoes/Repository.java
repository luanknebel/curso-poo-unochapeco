package com.unochapeco.treinamento.abstracoes;

public abstract class Repository {
	
	public void salvar(Modelo modelo) {
		System.out.println("salvando modelo com driver" + getDriver());
	}
	
	public void excluir(Modelo modelo) {
		System.out.println("excluindo modelo com driver" + getDriver());
	}
	
	public void atualizar(Modelo modelo) {
		System.out.println("atualizando modelo com driver" + getDriver());
	}	
	
	public abstract String getDriver();
	
}
