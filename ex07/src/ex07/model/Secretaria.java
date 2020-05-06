package ex07.model;

public abstract class Secretaria extends Funcionario {
	
	private Funcionario chefia;
	
	public Funcionario getChefia() {
		return chefia;
	}

	public void setChefia(Funcionario chefia) {
		this.chefia = chefia;
	}

}
