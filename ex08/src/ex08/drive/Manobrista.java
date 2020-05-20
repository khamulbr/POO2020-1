package ex08.drive;

public class Manobrista {
	
	private String nome;
	
	public Manobrista(String nome) {
		super();
		this.nome = nome;
	}

	public void fazerTestDrive(Veiculo veiculo) {
		while(veiculo.getVelocidade() < veiculo.getVelocidadeMaxima()) {
			veiculo.acelerar();
			System.out.println("Estou a " + veiculo.getVelocidade());
		}
		System.out.println(nome + " diz: 'Atingi a velocidade de " + veiculo.getVelocidade() + " e vou tentar parar essa bicheira'");
		
		while(veiculo.getVelocidade() > 0) {
			veiculo.frear();
			System.out.println("Estou a " + veiculo.getVelocidade());
		}
		
		System.out.println(nome + " diz: 'Parei o carro, ufa'");
	}
}
