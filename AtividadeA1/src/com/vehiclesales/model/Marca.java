package com.vehiclesales.model;

public class Marca {
	
	private String nome;
	private Integer numeroDeModelos;
	private Integer anoDeLancamento;
	private String codigoIdentificador;

	public Marca(String nome, Integer numeroDeModelos, Integer anoDeLancamento, String codigoIdentificador) {
		super();
		this.nome = nome;
		this.numeroDeModelos = numeroDeModelos;
		this.anoDeLancamento = anoDeLancamento;
		this.codigoIdentificador = codigoIdentificador;
	}
	
	@Override
	public String toString() {
		return "Marca [nome=" + nome + ", numeroDeModelos=" + numeroDeModelos + ", anoDeLancamento=" + anoDeLancamento
				+ ", codigoIdentificador=" + codigoIdentificador + "]";
	}

}