package ex08.drive;

public abstract class Veiculo implements MeioDeTransporte {
	
	private Double velocidade = 0.00;

	private Integer passageiros;
	
	private Double velocidadeMaxima;
	
	public Veiculo() {
		
	}
	
	public Veiculo(Integer passageiros, Double velocidadeMaxima) {
		super();
		this.passageiros = passageiros;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	protected void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
	public Integer getPassageiros() {
		return passageiros;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	

}
