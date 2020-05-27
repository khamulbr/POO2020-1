package atividade01;

public class Porsche extends Veiculo {

	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 20;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 10;
	}

}
