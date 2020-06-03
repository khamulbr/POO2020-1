package ex10;

public class Pessoa {
	
	private String RG;
	private String nome;
	private Integer idade;

	public Pessoa(String rG, String nome, Integer idade) {
		super();
		RG = rG;
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [RG = "+ RG + " nome=" + nome + ", idade=" + idade + "]";	
	}

	public String getRG() {
		return RG;
	}

	public String getNome() {
		return nome;
	}

}
