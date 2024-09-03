package com.unochapeco.treinamento.interfaces;

public class ArquivoDiscoService implements ArquivoService{

	@Override
	public void salvarArquivo(byte[] content) {
		System.out.println("salvando arquivo no disco");
	}

}
