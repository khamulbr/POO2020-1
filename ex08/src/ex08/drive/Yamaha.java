package ex08.drive;

public class Yamaha extends Veiculo {

	@Override
	public void acelerar() {
		this.setVelocidade(this.getVelocidade() + 15);
		
	}

	@Override
	public void frear() {
		this.setVelocidade(this.getVelocidade() / 3);		
	}
}
