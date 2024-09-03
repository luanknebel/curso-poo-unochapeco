package com.unochapeco.treinamento.solid.lsp.solucao;

import com.unochapeco.treinamento.solid.lsp.problema.Conta;

public class ContaPoupanca extends Conta{

	private double saldoMinimo;
	
	public ContaPoupanca(double saldo, double saldoMinimo) {
		super(saldo);
		this.saldoMinimo = saldoMinimo;
	}
	
	/**
	 * estamos garantindo o comportamento da classe ContaPoupanca e tambem da classe Conta.
	 */
	@Override
	public void sacar(double  quantia) {
		if(podeSacar(quantia)) {
			super.sacar(quantia);
		}else {
			throw new RuntimeException("Saldo insuficiente para manter o saldo minimo");
		}
	}
	
	private boolean podeSacar(double  quantia) {
		return ((saldo - quantia) >= saldoMinimo);
	}
	
	

}
