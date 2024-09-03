package com.unochapeco.treinamento.design.decorator;

public class ArquivoXMLNFe implements Model{

	private byte[] xml;

	@Override
	public byte[] getXML() {
		return xml;
	}

	@Override
	public void setXML(byte[] content) {
		this.xml = content;
	}
	
}
