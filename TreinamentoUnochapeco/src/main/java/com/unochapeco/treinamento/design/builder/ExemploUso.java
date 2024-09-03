package com.unochapeco.treinamento.design.builder;

public class ExemploUso {

	public static void main(String[] args) {
		
		//Exemplo ruim, complexo, muitos parametros, facil de errar os parametros, código sujo!
		NotaFiscal notaFiscalRuim = new NotaFiscal(null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, false);
		
		//Exemplo com Builder, facil entendimento, código limpo, o Builder pode receber alguns (poucos) parametros para construir 
		// o objeto pelo metodo interno build();
		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		
		NotaFiscal notaFiscalBom = notaFiscalBuilder
		.withCancelada(false)
		.withNumero("123456")
		.withCodigoEmitente("123")
		.withChave("123123213213213")
		.withDescricaoEmitente("emitente")
		.build();
		
	}
	
}
