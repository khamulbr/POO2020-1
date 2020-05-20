package com.vehiclesales.model;

public class Carro {

	private String modelo;
	
	private String cor;
	
	private Integer ano;
	
	private Marca marca;

	private String chassi;
	
	private Proprietario proprietario;
	
	private Integer velocidadeMaxima;
	
	private Integer velocidadeAtual;
	
	private Integer numeroDePortas;
	
	private Boolean temTetoSolar;
	
	private Integer numeroDeMarchas;
	
	private Integer marchaAtual;
	
	private Double capacidadeCombustivel;

	public Carro(String modelo, String cor, Integer ano, Marca marca, String chassi, Proprietario proprietario,
			Integer velocidadeMaxima, Integer numeroDePortas, Boolean temTetoSolar, Integer numeroDeMarchas,
			Double capacidadeCombustivel) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroDePortas = numeroDePortas;
		this.temTetoSolar = temTetoSolar;
		this.numeroDeMarchas = numeroDeMarchas;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.velocidadeAtual = 0;
		this.marchaAtual = 0;
	}

	public Double autonomia (Double consumoMedio) {
		return  capacidadeCombustivel * consumoMedio;
	}
	
	public void reduzMarcha() {
		if ((marchaAtual == 0 && velocidadeAtual == 0) || (marchaAtual > 0))
			this.marchaAtual--;
	}
	
	public void aumentaMarcha() {
		this.marchaAtual++;
	}
	
	public void frear() {
		this.velocidadeAtual = 0;
	}
	
	public void aumentaVelocidade() {
		this.velocidadeAtual = this.velocidadeAtual + 1;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi
				+ ", proprietario=" + proprietario + ", velocidadeMaxima=" + velocidadeMaxima + ", velocidadeAtual="
				+ velocidadeAtual + ", numeroDePortas=" + numeroDePortas + ", temTetoSolar=" + temTetoSolar
				+ ", numeroDeMarchas=" + numeroDeMarchas + ", marchaAtual=" + marchaAtual + ", capacidadeCombustivel="
				+ capacidadeCombustivel + "]";
	}

	public String getChassi() {
		return this.chassi;
	}

	
	
}
