package atividade01;

public class Yamaha extends Veiculo {

	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 15;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 20;
	}

}
