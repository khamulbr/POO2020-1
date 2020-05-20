package ex07.model;

public abstract class Funcionario  {

	private String nome;

	private String cpf;
	
	protected Double salario = 0.00;
	
	public void setBonificacao(Double bonificacao) {
		this.salario = this.salario + bonificacao;
	}

	public Double getBonificacao() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}	
	
	public Double getSalario() {
		return this.salario;
	}
	
	
}
