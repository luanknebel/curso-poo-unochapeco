package com.unochapeco.treinamento.solid.ocp.solucao;

import java.math.BigDecimal;

public class Programador extends Funcionario{

	@Override
	public BigDecimal getSalario() {
		return new BigDecimal(3500);
	}

}
