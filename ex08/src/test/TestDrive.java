package test;

import ex08.drive.LandRover;
import ex08.drive.Manobrista;
import ex08.drive.Porsche;
import ex08.drive.Veiculo;
import ex08.drive.Yamaha;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo v1 = new LandRover();
		v1.setVelocidadeMaxima(250.0);
		
		Manobrista joao = new Manobrista("João");
		joao.fazerTestDrive(v1);
		
		Veiculo v2 = new Porsche();
		v2.setVelocidadeMaxima(340.0);
		
		joao.fazerTestDrive(v2);
		
		Veiculo v3 = new Yamaha();
		v3.setVelocidadeMaxima(489.0);
		
		joao.fazerTestDrive(v3);
	}

}
