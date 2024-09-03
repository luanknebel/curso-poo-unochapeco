package com.unochapeco.treinamento.solid.isp.problema;

/**
 * nem todas as impressores possuem scanner e fax, necessario segregar as interfaces
 */
public interface Impressora {

	void imprimirDocumento();
	void escanearDocumento();
	void enviarFax();
	
}
