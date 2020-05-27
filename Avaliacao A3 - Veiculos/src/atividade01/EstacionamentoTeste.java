package atividade01;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		Manobrista joao = new Manobrista("João");

		LandRover landRover1 = new LandRover();
		
		joao.setVeiculoSendoManobrado(landRover1);
		
		joao.manobrar();
		
		Veiculo landRover2 = new LandRover();
		
		joao.setVeiculoSendoManobrado(landRover2);
		
		joao.manobrar();
		
		Veiculo porsche1 = new Porsche();
		
		joao.setVeiculoSendoManobrado(porsche1);
		
		joao.manobrar();
	}

}
