package edu.uniritter.poo2020_1.ex1;

public class TesteCirculo {

	public static void main(String[] args) {
		
		System.out.println(Circulo.piX2());		

		// 1) Crie 2 objetos de Circulo diferentes 
		// 1.1) Crie um construtor para Circulo com seus 3 atributos
		Ponto primeiroPonto = new Ponto(10, 5, 10);
		Circulo primeiroCirculo = new Circulo(primeiroPonto,2);
		Ponto segundoPonto = new Ponto(1, 2);
		Circulo segundoCirculo = new Circulo(segundoPonto,6);
		Ponto terceiroPonto = new Ponto(100, 100);
		Circulo terceiroCirculo = new Circulo(terceiroPonto,9);
		Ponto quartoPonto = new Ponto(-50, -20);
		Circulo quartoCirculo = new Circulo(quartoPonto, 90);
		Ponto quintoPonto = new Ponto(-5, -1);
		Circulo quintoCirculo = new Circulo(quintoPonto,2);
		
		Circulo sextoCirculo = new Circulo(10,20,10);
		
		// 2) Crie um vetor de 5 objetos Circulo e preencha cada um deles
//		Circulo[] circulos = new Circulo[5];
//		circulos[0] = primeiroCirculo;
//		circulos[1] = segundoCirculo;
//		circulos[2] = terceiroCirculo;
//		circulos[3] = quartoCirculo;
//		circulos[4] = quintoCirculo;
		
		Circulo[] circulos1 = {primeiroCirculo, segundoCirculo,
				terceiroCirculo, quartoCirculo, quintoCirculo};		
		
		// 3) imprima os valores x, y e raio de cada um dos objetos 
		// do vetor
		
//		for (int indice=0; indice<5; indice++){
//			System.out.println("O circulo "+ indice + " em circulos1 " + 
//					" tem para x="+circulos1[indice].x + 
//					" e para y="+circulos1[indice].y + 
//					" e raio=" +circulos1[indice].raio);
//		}
		
		Object objeto = new Object();
		
		// 4) Crie outro vetor do tipo Circulo, mas sem tamanho
		Circulo[] circulos2;
		
		// 5) copie a referência do primeiro vetor para o segundo
		circulos2 = circulos1;

		// 6) imprima ambos os vetores
//		for (int indice=0; indice<5; indice++){
//			System.out.println("O circulo "+ indice + " em circulos2 " +
//					" tem para x="+circulos2[indice].x + 
//					" e para y="+circulos2[indice].y + 
//					" e raio=" +circulos2[indice].raio);
//		}
		
		// 7) crie um terceiro vetor
		Circulo[] circulos3;
		
		// 8) copie os objetos do primeiro vetor para o terceiro
		circulos3 = circulos1;
		
		// 9) altere os valores de raio para os objetos do primeiro vetor


		// 10)  imprima os três vetores
		for (int indice=0; indice<5; indice++){
			System.out.println("O circulo de id "+ circulos1[indice].toString() + " em circulos1 " + 
					" tem para x="+circulos1[indice].getPonto().getX() + 
					" e para y="+circulos1[indice].getPonto().getY() + 
					" e raio=" +circulos1[indice].getRaio() +
					" e sua circunferencia é = " + circulos1[indice].circunferencia());
		}
		
//		primeiroCirculo.setRaio(181203);
//		segundoCirculo.setRaio(257130);
//		terceiroCirculo.setRaio(398731);
//		quartoCirculo.setRaio(482911);
//		quintoCirculo.setRaio(5128301);
//		
//		for (int indice=0; indice<5; indice++){
//			System.out.println("O circulo de id "+ circulos2[indice].toString()+ " em circulos2 " +
//					" tem para x="+circulos2[indice].getX() + 
//					" e para y="+circulos2[indice].getY() + 
//					" e raio=" +circulos2[indice].getRaio());
//		}
//		
//		for (int indice=0; indice<5; indice++){
//			System.out.println("O circulo de id "+ circulos3[indice].toString() + " em circulos3 " +
//					" tem para x="+circulos3[indice].getX() + 
//					" e para y="+circulos3[indice].getY() + 
//					" e raio=" +circulos3[indice].getRaio());
//		}
		
		String texto = "Essa aula tá demais!";
		
		System.out.println(texto.toUpperCase());

	}

}
