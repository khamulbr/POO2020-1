package ex06;

public class Cilindro extends Figura {

	private Integer raio;
	private Integer altura;

	public Cilindro(CoordenadaInicial coordenadaInicial, Integer raio, Integer altura) {
		super(coordenadaInicial);
		this.raio = raio;
		this.altura = altura;
	}

	public Double area(){
		return 2 * (Math.PI * (raio * raio)) + 2 * (Math.PI * raio * altura);
	}
}
