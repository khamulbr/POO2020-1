package atividade01;

public class Manobrista {
	
	private Veiculo veiculoSendoManobrado;
	private String nome;

	public Manobrista(String nome) {
		this.nome = nome;
	}

	public Veiculo getVeiculoSendoManobrado() {
		return veiculoSendoManobrado;
	}

	public void setVeiculoSendoManobrado(Veiculo veiculoSendoManobrado) {
		this.veiculoSendoManobrado = veiculoSendoManobrado;
	}
	
	public void manobrar() {
		System.out.println("iniciando as manobras ousadas uou !" + this.toString());
		veiculoSendoManobrado.acelerar();
		veiculoSendoManobrado.acelerar();

		while (veiculoSendoManobrado.getVelocidade() > 0) {
			veiculoSendoManobrado.frear();
		}
		
		System.out.println("acabou a brincadeira!");
	}

	@Override
	public String toString() {
		return "Manobrista [nome=" + nome + ", veiculoSendoManobrado=" + veiculoSendoManobrado + "]";
	}

	
}
