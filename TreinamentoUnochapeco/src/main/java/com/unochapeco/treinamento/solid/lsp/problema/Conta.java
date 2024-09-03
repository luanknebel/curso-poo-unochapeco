package com.unochapeco.treinamento.solid.lsp.problema;

/**
 * o saque da conta somente pode ocorrer se tiver saldo.
 * (exemplo de encapsulamento de regra de negocio)
 */
public class Conta {

	protected double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void sacar(double  quantia) {
		if(quantia > 0 && quantia <= saldo) {
			saldo = saldo - quantia;
		}else {
			throw new RuntimeException("Nao e possivel sacar valor acima do saldo disponivel");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
