package ex04.app;

import java.time.LocalDate;

public class Proprietario {

	private String nome; 
	private String CPF; 
	private String RG;
	private LocalDate dataDeNascimento;
	private Endereco endereco;

	public Proprietario(String nome, String CPF, String RG, Endereco endereco) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.RG = CPF;
		this.endereco = endereco;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + 
				", CPF=" + CPF + 
				", RG=" + RG + 
				", dataDeNascimento=" + dataDeNascimento + 
				", endereco=" + endereco + 
				"]";
	}

}
