package com.unochapeco.treinamento.classes;

public class Veiculo {

	private String cor;
	private String marca;
	private String modelo;
	private String placa;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void andar() {
		System.out.println("Andando...");
	}

	public void parar() {
		System.out.println("Parando...");
	}

	public void trocarMarcha() {
		System.out.println("Trocando Marcha...");
	}

}
