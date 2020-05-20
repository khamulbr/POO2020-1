import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.vehiclesales.business.Venda;
import com.vehiclesales.model.Carro;
import com.vehiclesales.model.Endereco;
import com.vehiclesales.model.Marca;
import com.vehiclesales.model.Proprietario;

public class VendaTest {
	
	@Test
	public void itShouldAddOneCar() {
		
		// DADO QUE
		Venda venda = new Venda();	
		Endereco enderecoJoao = 
				new Endereco("rua 1", "bairro 1", "cidade 1", "RS", "90121-010", "casa 2");	
		Proprietario joao = 
				new Proprietario("João", "21983209", "98292381", enderecoJoao);
		Marca ford = new Marca("Ford", 20, 1901, "ford");
		Carro carroDoJoao = 
				new Carro("Escort XR3", "amarela", 1996, ford, "SADS09D2E12E190",
						joao, 180, 2, true, 4, 45.0);
		
		//QUANDO EU 
		venda.adicionar(carroDoJoao);
		
		// ENTAO EU RECEBO
		assertEquals(1, venda.getNumeroDeCarros());
	}
	
	@Test
	public void itShouldAddTwoCars() {
		// DADO QUE
		Venda venda = new Venda();	
		Endereco enderecoJoao = 
				new Endereco("rua 1", "bairro 1", "cidade 1", "RS", "90121-010", "casa 2");	
		Proprietario joao = 
				new Proprietario("João", "21983209", "98292381", enderecoJoao);
		Marca ford = new Marca("Ford", 20, 1901, "ford");
		Carro carroDoJoao1 = 
				new Carro("Escort XR3", "amarela", 1996, ford, "SADS09D2E12E190",
						joao, 180, 2, true, 4, 45.0);
		Carro carroDoJoao2 = 
				new Carro("Fiesta", "vermelho", 2015, ford, "2J2H1380912H21",
						joao, 140, 4, false, 5, 52.0);
		
		//QUANDO EU 
		venda.adicionar(carroDoJoao1);
		venda.adicionar(carroDoJoao2);
		
		// ENTAO EU
		assertEquals(2, venda.getNumeroDeCarros());
	}

	@Test
	public void itShouldGetACarByAnExistingChassisWhenOnlyOneCarIsOnSale() {
		// DADO
		Venda venda = new Venda();	
		Endereco enderecoJoao = 
				new Endereco("rua 1", "bairro 1", "cidade 1", "RS", "90121-010", "casa 2");	
		Proprietario joao = 
				new Proprietario("João", "21983209", "98292381", enderecoJoao);
		Marca ford = new Marca("Ford", 20, 1901, "ford");
		Carro carroDoJoao1 = 
				new Carro("Escort XR3", "amarela", 1996, ford, "SADS09D2E12E190",
						joao, 180, 2, true, 4, 45.0);
		venda.adicionar(carroDoJoao1);
		
		// QUANDO
		Carro carroEscolhido = venda.obter("SADS09D2E12E190");
		
		// ENTAO
		assertEquals(carroDoJoao1, carroEscolhido);
	}
}
