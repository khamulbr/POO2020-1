package com.vehiclesales.model;

import java.util.Date;

public class Proprietario {

	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private Date dataNascimento;

	private Endereco endereco;

	public Proprietario (String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento
				+ ", endereco=" + endereco + "]";
	}


	
}
