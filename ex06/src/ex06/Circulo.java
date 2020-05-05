package ex06;

public class Circulo extends Figura {

	private Integer raio;

	public Circulo(CoordenadaInicial coordenadaInicial, Integer raio) {
		super(coordenadaInicial);
		this.raio = raio;
	}
	
	public Double area(){
		return Math.PI * (raio * raio); 
	}

}
