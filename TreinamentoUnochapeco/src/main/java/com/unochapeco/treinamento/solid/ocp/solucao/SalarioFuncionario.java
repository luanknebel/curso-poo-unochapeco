package com.unochapeco.treinamento.solid.ocp.solucao;

import java.math.BigDecimal;

/**
 * desta forma a classe de calculo fica aberta para expansao (novos funcionarios) 
 * e fechada para modificacao, pois nao necessita de novas modificacoes ao adicionar novos funcionarios
 */
public class SalarioFuncionario {

	private BigDecimal descontoIR = new BigDecimal(7);

	public BigDecimal calcularSalarioFuncionario(Funcionario funcionario) {

		BigDecimal descontoPercentualIR = descontoIR.divide(new BigDecimal(100));
		BigDecimal salario = funcionario.getSalario();
		BigDecimal desconto = salario.multiply(descontoPercentualIR);
		
		return salario.subtract(desconto);
	}

}
