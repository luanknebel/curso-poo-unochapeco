package com.unochapeco.treinamento.interfaces;

public class ArquivoNuvemService implements ArquivoService{

	@Override
	public void salvarArquivo(byte[] content) {
		System.out.println("salvando arquivo na nuvem");
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}

}
