package ex06;

public class Quadrado extends Figura {

	private Integer lado;

	public Quadrado(CoordenadaInicial coordenadaInicial, Integer lado) {
		super(coordenadaInicial);
		this.lado = lado;
	}
	
	public Double area(){
		return (double) (lado * lado);
	}

}
