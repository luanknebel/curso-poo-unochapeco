package com.unochapeco.treinamento;

import com.unochapeco.treinamento.interfaces.ArquivoBancoService;
import com.unochapeco.treinamento.interfaces.ArquivoDiscoService;
import com.unochapeco.treinamento.interfaces.ArquivoNuvemService;
import com.unochapeco.treinamento.interfaces.ArquivoService;

/**
 * classe principl utilizada para exercicos
 */
public class Main {

	public static void main(String[] args) {
		
		ArquivoService arquivoService;
		
		arquivoService = new ArquivoBancoService();
		arquivoService = new ArquivoDiscoService();
		arquivoService = new ArquivoNuvemService();
		
		arquivoService.salvarArquivo(null);
	}

}
