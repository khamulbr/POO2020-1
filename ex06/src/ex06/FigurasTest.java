package ex06;

public class FigurasTest {

	public static void main(String[] args) {
		CoordenadaInicial coordenadaInicial = new CoordenadaInicial(10, 10); 
		Figura fig1 = new Figura(coordenadaInicial);
		
		Circulo circ1 = new Circulo(coordenadaInicial, 5);
		System.out.println(circ1.area());

		Quadrado quad1 = new Quadrado(coordenadaInicial, 5);
		System.out.println(quad1.area());

		Retangulo ret1 = new Retangulo(coordenadaInicial, 5, 3);
		System.out.println(ret1.area());
		
		Cone con1 = new Cone(coordenadaInicial, 5, 3);
		System.out.println(con1.area());
		
		Cilindro cil1 = new Cilindro(coordenadaInicial, 5, 3);
		System.out.println(cil1.area());
	}

}
