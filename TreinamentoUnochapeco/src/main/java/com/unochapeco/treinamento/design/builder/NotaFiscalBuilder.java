package com.unochapeco.treinamento.design.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * O padrao build pode ser utilizado de diferentes formas, 
 * realiando a junção de metodos with()... ou passando os objetos bases para o Builder para construir um objeto complexo.
 */
public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal = new NotaFiscal();
	
	/**
	 * Builder permite um construtor para passar os objetos base para construção do objeto complexo (NotaFiscal).
	 */
	public NotaFiscalBuilder() {
	}
	
	// Se o NotaFiscalBuilder receber alguns parametros pelo construtor, 
    // pode-se alimentar o objeto NotaFiscal diretamente pelo objeto build
    // evitando o uso dos metidos with(), ou usando somente quando necessário.
	public NotaFiscal build() {
		return notaFiscal;
	}
	
	
	public NotaFiscalBuilder withNumero(String numero) {
		notaFiscal.setNumero(numero);
		return this;
	}

	public NotaFiscalBuilder withTipoNFe(String tipoNFe) {
		notaFiscal.setTipoNFe(tipoNFe);
		return this;
	}

	public NotaFiscalBuilder withSerie(String serie) {
		notaFiscal.setSerie(serie);
		return this;
	}

	public NotaFiscalBuilder withData(LocalDateTime data) {
		notaFiscal.setData(data);
		return this;
	}

	public NotaFiscalBuilder withChave(String chave) {
		notaFiscal.setChave(chave);
		return this;
	}

	public NotaFiscalBuilder withCodigoEmitente(String codigoEmitente) {
		notaFiscal.setCodigoEmitente(codigoEmitente);
		return this;
	}

	public NotaFiscalBuilder withDescricaoEmitente(String descricaoEmitente) {
		notaFiscal.setDescricaoEmitente(descricaoEmitente);
		return this;
	}

	public NotaFiscalBuilder withCodigoDestinatario(String codigoDestinatario) {
		notaFiscal.setCodigoDestinatario(codigoDestinatario);
		return this;
	}

	public NotaFiscalBuilder withDescricaoDestinatario(String descricaoDestinatario) {
		notaFiscal.setDescricaoDestinatario(descricaoDestinatario);
		return this;
	}

	public NotaFiscalBuilder withValorTotal(BigDecimal valorTotal) {
		notaFiscal.setValorTotal(valorTotal);
		return this;
	}

	public NotaFiscalBuilder withValorImpostos(BigDecimal valorImpostos) {
		notaFiscal.setValorImpostos(valorImpostos);
		return this;
	}

	public NotaFiscalBuilder withValorDescontos(BigDecimal valorDescontos) {
		notaFiscal.setValorDescontos(valorDescontos);
		return this;
	}

	public NotaFiscalBuilder withQuantidadeItens(int quantidadeItens) {
		notaFiscal.setQuantidadeItens(quantidadeItens);
		return this;
	}

	public NotaFiscalBuilder withProtocoloAutorizacao(int protocoloAutorizacao) {
		notaFiscal.setProtocoloAutorizacao(protocoloAutorizacao);
		return this;
	}

	public NotaFiscalBuilder withImpresso(boolean impresso) {
		notaFiscal.setImpresso(impresso);
		return this;
	}

	public NotaFiscalBuilder withCancelada(boolean cancelada) {
		notaFiscal.setCancelada(cancelada);
		return this;
	}
	
}
