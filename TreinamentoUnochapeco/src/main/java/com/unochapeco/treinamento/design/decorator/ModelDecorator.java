package com.unochapeco.treinamento.design.decorator;

/**
 * Classe responsavel por decorar a entidade modelo XML, 
 * A classe ira compactar e descompactar o XML sem a necessidade de mudar a classe 
 * concreta do Modelo.
 */
public class ModelDecorator {
	
	private Model model;

	public ModelDecorator(Model model) {
		this.model = model;
	}

	public void setXML(byte[] content) {
		//compacta o xml e atribui ao modelo
		model.setXML(content);
	}
	
	public byte[] getXML() {
		// descompata o xml e retorna para o cliente
		byte[] xml = model.getXML();
		return xml;
	}
	
	
}
