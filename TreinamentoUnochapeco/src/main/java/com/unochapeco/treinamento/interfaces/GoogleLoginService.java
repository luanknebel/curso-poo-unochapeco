package com.unochapeco.treinamento.interfaces;

public class GoogleLoginService implements LoginService{

	@Override
	public void realizarLogin(String usuario, String senha) {
		System.out.println("logando com a conta do google");
	}

}
