package com.unochapeco.treinamento.solid.isp.solucao;

public class ImpressoraCompleta implements Impressora, Escaneadora, Fax{

	@Override
	public void enviarFax() {
		System.out.println("imprimindo documento");
	}

	@Override
	public void escanearDocumento() {
		System.out.println("escaneando documento");
	}

	@Override
	public void imprimirDocumento() {
		System.out.println("enviando fax documento");
	}

}
