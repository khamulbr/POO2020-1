package ex08.drive;

public class LandRover extends Veiculo {

	@Override
	public void acelerar() {
		this.setVelocidade(this.getVelocidade() + 5);
		
	}

	@Override
	public void frear() {
		this.setVelocidade(this.getVelocidade() / 2);		
	}

}
