package com.unochapeco.treinamento.solid.ocp.problema;

import java.math.BigDecimal;

/**
 * a classe sempre precisa ser modificada para adicionar um novo funcionario
 */
public class SalarioFuncionario {
	
	private BigDecimal descontoIR = new BigDecimal(7);
	
	public BigDecimal calcularSalarioFuncionario(Funcionario funcionario) {
		
		BigDecimal descontoPercentualIR = descontoIR.divide(new BigDecimal(100));
		
		if(funcionario.getTipoFuncionario() == "Analista") {
			
			BigDecimal salario = new BigDecimal(2500);
			BigDecimal desconto = salario.multiply(descontoPercentualIR);
			return salario.subtract(desconto);
		}
		
		if(funcionario.getTipoFuncionario() == "Programador") {
			
			BigDecimal salario = new BigDecimal(3500);
			BigDecimal desconto = salario.multiply(descontoPercentualIR);
			return salario.subtract(desconto);
		}
		
		return BigDecimal.ZERO;
	}
	
}
