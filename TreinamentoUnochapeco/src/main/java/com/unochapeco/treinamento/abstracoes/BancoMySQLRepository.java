package com.unochapeco.treinamento.abstracoes;

public class BancoMySQLRepository extends Repository{

	@Override
	public String getDriver() {
		return "MySQL"; 
	}

}
