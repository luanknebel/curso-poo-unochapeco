package com.unochapeco.treinamento.abstracoes;

public abstract class FiguraGeometrica {

	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public abstract String getDescricao();

	public abstract int getArea();

}
