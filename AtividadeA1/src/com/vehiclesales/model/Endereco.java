package com.vehiclesales.model;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep="
				+ cep + ", complemento=" + complemento + "]";
	}

	
}