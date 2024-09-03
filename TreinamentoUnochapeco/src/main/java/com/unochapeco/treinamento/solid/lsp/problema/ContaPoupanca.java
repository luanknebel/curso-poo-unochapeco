package com.unochapeco.treinamento.solid.lsp.problema;

public class ContaPoupanca extends Conta{

	private double saldoMinimo;
	
	public ContaPoupanca(double saldo, double saldoMinimo) {
		super(saldo);
		this.saldoMinimo = saldoMinimo;
	}
	
	/**
	 * aqui estamos sobrescrevendo (polimorfismo) do metodo sacar, 
	 * mas mudando o comportamento padrao esperado da conta.
	 * sem considerar a variavel de saldo da classe conta para realizar o saque.
	 */
	@Override
	public void sacar(double  quantia) {
		if((saldo - quantia) >= saldoMinimo) {
			saldo = saldo - quantia;
		}else {
			throw new RuntimeException("Saldo insuficiente para manter o saldo minimo");
		}
	}
	

}
