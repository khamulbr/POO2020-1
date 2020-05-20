package ex09;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomaDeDoisNumeros() {
		// SETUP
		Calculadora c1 = new Calculadora();
		Double valorEsperado = 4.00;
		
		// EXECUCAO DA LOGICA
		Double valorCalculado = c1.soma(1.00, 3.00);
		
		// VALIDACAO DO RESULTADO
		assertEquals(valorEsperado, valorCalculado);
	}
	
	@Test
	public void testSomaDeUmNumeroComNulo() {
		// SETUP
		Calculadora c1 = new Calculadora();
		Double valorEsperado = 1.00;
		
		// EXECUCAO DA LOGICA
		Double valorCalculado = c1.soma(1.00, null);
		
		// VALIDACAO DO RESULTADO
		assertEquals(valorEsperado, valorCalculado);
	}

}
