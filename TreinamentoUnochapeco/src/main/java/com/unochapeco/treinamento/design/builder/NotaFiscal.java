package com.unochapeco.treinamento.design.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representação de um objeto complexo, com varias informacoes, que são oriundas de outros objetos.
 */
public class NotaFiscal {

	private String numero;
	private String tipoNFe;
	private String serie;
	private LocalDateTime data;
	private String chave;
	private String codigoEmitente;
	private String descricaoEmitente;
	private String codigoDestinatario;
	private String descricaoDestinatario;
	private BigDecimal valorTotal;
	private BigDecimal valorImpostos;
	private BigDecimal valorDescontos;
	private int quantidadeItens;
	private int protocoloAutorizacao;
	private boolean impresso;
	private boolean cancelada;

	public NotaFiscal() {
	}
	
	/**
	 * Construtor extremamente complexo com muitos parametros, induzindo ao erro e a bugs inesperados.
	 */
	public NotaFiscal(String numero, String tipoNFe, String serie, LocalDateTime data, String chave,
			String codigoEmitente, String descricaoEmitente, String codigoDestinatario, String descricaoDestinatario,
			BigDecimal valorTotal, BigDecimal valorImpostos, BigDecimal valorDescontos, int quantidadeItens,
			int protocoloAutorizacao, boolean impresso, boolean cancelada) {
		
		this.numero = numero;
		this.tipoNFe = tipoNFe;
		this.serie = serie;
		this.data = data;
		this.chave = chave;
		this.codigoEmitente = codigoEmitente;
		this.descricaoEmitente = descricaoEmitente;
		this.codigoDestinatario = codigoDestinatario;
		this.descricaoDestinatario = descricaoDestinatario;
		this.valorTotal = valorTotal;
		this.valorImpostos = valorImpostos;
		this.valorDescontos = valorDescontos;
		this.quantidadeItens = quantidadeItens;
		this.protocoloAutorizacao = protocoloAutorizacao;
		this.impresso = impresso;
		this.cancelada = cancelada;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipoNFe() {
		return tipoNFe;
	}

	public void setTipoNFe(String tipoNFe) {
		this.tipoNFe = tipoNFe;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getCodigoEmitente() {
		return codigoEmitente;
	}

	public void setCodigoEmitente(String codigoEmitente) {
		this.codigoEmitente = codigoEmitente;
	}

	public String getDescricaoEmitente() {
		return descricaoEmitente;
	}

	public void setDescricaoEmitente(String descricaoEmitente) {
		this.descricaoEmitente = descricaoEmitente;
	}

	public String getCodigoDestinatario() {
		return codigoDestinatario;
	}

	public void setCodigoDestinatario(String codigoDestinatario) {
		this.codigoDestinatario = codigoDestinatario;
	}

	public String getDescricaoDestinatario() {
		return descricaoDestinatario;
	}

	public void setDescricaoDestinatario(String descricaoDestinatario) {
		this.descricaoDestinatario = descricaoDestinatario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorImpostos() {
		return valorImpostos;
	}

	public void setValorImpostos(BigDecimal valorImpostos) {
		this.valorImpostos = valorImpostos;
	}

	public BigDecimal getValorDescontos() {
		return valorDescontos;
	}

	public void setValorDescontos(BigDecimal valorDescontos) {
		this.valorDescontos = valorDescontos;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public int getProtocoloAutorizacao() {
		return protocoloAutorizacao;
	}

	public void setProtocoloAutorizacao(int protocoloAutorizacao) {
		this.protocoloAutorizacao = protocoloAutorizacao;
	}

	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

}
