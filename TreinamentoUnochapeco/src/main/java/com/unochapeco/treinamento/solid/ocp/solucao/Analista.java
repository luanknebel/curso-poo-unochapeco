package com.unochapeco.treinamento.solid.ocp.solucao;

import java.math.BigDecimal;

public class Analista extends Funcionario{

	@Override
	public BigDecimal getSalario() {
		return new BigDecimal(2500);
	}

}
