package ex06;

public class Retangulo extends Figura {

	private Integer lado1;
	private Integer lado2;

	public Retangulo(CoordenadaInicial coordenadaInicial, Integer lado1, Integer lado2) {
		super(coordenadaInicial);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Double area(){
		return (double) (lado1 * lado2);
	}

}
