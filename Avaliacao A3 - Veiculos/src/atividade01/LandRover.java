package atividade01;

public class LandRover extends Veiculo {

	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 10;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 5;
	}

}
