package com.unochapeco.treinamento.interfaces;

public class ArquivoBancoService implements ArquivoService{

	@Override
	public void salvarArquivo(byte[] content) {
		System.out.println("salvando arquivo no banco de dados");
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	
	public void getId() {

	}
}
