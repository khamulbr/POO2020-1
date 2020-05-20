package ex08.drive;

public class Porsche extends Veiculo {

	@Override
	public void acelerar() {
		this.setVelocidade(this.getVelocidade() + 10);
		
	}

	@Override
	public void frear() {
		this.setVelocidade(this.getVelocidade() / 5);		
	}
}
