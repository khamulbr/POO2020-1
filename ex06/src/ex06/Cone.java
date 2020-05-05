package ex06;

public class Cone extends Figura {

	private Integer raio;
	private Integer geratriz;

	public Cone(CoordenadaInicial coordenadaInicial, Integer raio, Integer geratriz) {
		super(coordenadaInicial);
		this.raio = raio;
		this.geratriz = geratriz;
	}

	public Double area(){
		return Math.PI * raio * (geratriz + raio);
	}
}
