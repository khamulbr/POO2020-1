package edu.uniritter.poo2020_1.ex1;

public class Circulo {
	
	// atributos, valores que podem variar de objeto para objeto
	private Ponto ponto;

	private int raio;
	
	// variavel estática, nao muda de objeto para objeto
	public static final double PI = 3.14159;
	
	public Circulo(Ponto ponto, int novoRaio) {
		this.ponto = ponto;
		this.raio = novoRaio;		
	}
	
   //S O L I D
	public Circulo(int novoX, int novoY, int novoRaio) {
		this.ponto = new Ponto(novoX, novoY);
		this.raio = novoRaio;
	}


	public static double piX2(){
		return PI * 2;
	}

	protected double circunferencia(){
		return 2 * PI * raio;
	}
	
	public int getRaio(){
		return this.raio;
	}
	
	public void setRaio(int novoRaio){
		this.raio = novoRaio;
	}

	public Ponto getPonto() {
		return ponto;
	}	
}