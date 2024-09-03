package com.unochapeco.treinamento.polimorfirmo;

import java.math.BigDecimal;

/**
 * exemplo de polimorfismo de sobrecarga
 */
public class Calculadora {

	public BigDecimal somar(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}
	
	public float somar(float x, float y) {
		return x + y;
	}
	
	public int somar(int x, int y) {
		return x + y;
	}
	
}
