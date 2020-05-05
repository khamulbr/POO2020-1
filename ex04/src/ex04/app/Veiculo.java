package ex04.app;

public class Veiculo {

	private String modelo;
	private String cor;
	private Integer ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private Integer velocidadeMaxima;
	private Integer nrDePortas;
	private Integer nrMarchas;
	private Boolean temTetoSolar;
	private Boolean temCambioAutomatico;

	private Integer velocidadeAtual;
	private Integer volumeDeCombustivel;
	private Integer marchaAtual;
	
	public Veiculo(String modelo, String cor, Integer ano, Marca marca, 
			String chassi, Proprietario proprietario, Integer velocidadeMaxima, 
			Integer nrDePortas, Integer nrMarchas, Boolean temTetoSolar,
			Boolean temCambioAutomatico) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.nrDePortas = nrDePortas;
		this.nrMarchas = nrMarchas;
		this.temTetoSolar = temTetoSolar;
		this.temCambioAutomatico = temCambioAutomatico;
		this.velocidadeAtual = 0;
		this.volumeDeCombustivel = 0;
		this.marchaAtual = 0;
	}
	
	public Double calcularAutonomia(Double consumo) {
		return consumo * this.volumeDeCombustivel;
	}

	public void abastecer(int litros) {
		this.volumeDeCombustivel += litros;		
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi
				+ ", proprietario=" + proprietario + ", velocidadeMaxima=" + velocidadeMaxima + ", nrDePortas="
				+ nrDePortas + ", nrMarchas=" + nrMarchas + ", temTetoSolar=" + temTetoSolar + ", temCambioAutomatico="
				+ temCambioAutomatico + ", velocidadeAtual=" + velocidadeAtual + ", volumeDeCombustivel="
				+ volumeDeCombustivel + ", marchaAtual=" + marchaAtual + "]";
	}

	public String getChassi() {
		return this.chassi;
	}

	public String getCor() {
		return this.cor;
	}

}
