package com.unochapeco.treinamento.abstracoes;

public class BancoPostgreSQLRepository extends Repository{

	@Override
	public String getDriver() {
		return "postgres";
	}

}
