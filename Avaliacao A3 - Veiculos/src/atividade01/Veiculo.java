package atividade01;
public abstract class Veiculo {
	
	protected Double velocidade = 0.0;
	private Integer passageiros;

	public Double getVelocidade() {
		return velocidade;
	}
	
	public Integer getPassageiros() {
		return passageiros;
	};
	
	public abstract void acelerar();
	
	public abstract void frear();

}
