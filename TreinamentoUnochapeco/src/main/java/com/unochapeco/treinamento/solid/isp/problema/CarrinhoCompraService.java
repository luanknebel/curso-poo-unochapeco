package com.unochapeco.treinamento.solid.isp.problema;

/**
 * interface que obriga a classe concreta a implementar muitas coisas, 
 * aumentando a responsabilidade da implementacao, a solucao é segragar em interfaces separadas 
 * os metodos que fazem sentido para o mesmo contexto de implementacao.
 */
public interface CarrinhoCompraService {

	void adicionarItem();
	void removerItem();
	void calcularTotal();
	void realizarPagamento();
	void aplicarCupomDesconto();
	void cancelarCompra();
	void finalizarCompra();
	
}
