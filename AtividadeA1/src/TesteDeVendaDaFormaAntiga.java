import java.util.List;

import com.vehiclesales.business.Venda;
import com.vehiclesales.model.Carro;
import com.vehiclesales.model.Endereco;
import com.vehiclesales.model.Marca;
import com.vehiclesales.model.Proprietario;

public class TesteDeVendaDaFormaAntiga {

	public static void main(String[] args) {
		// DADO QUE
		Venda venda = new Venda();	
		Endereco enderecoJoao = 
				new Endereco("rua 1", "bairro 1", "cidade 1", "RS", "90121-010", "casa 2");	
		Proprietario joao = 
				new Proprietario("João", "21983209", "98292381", enderecoJoao);
		Marca ford = new Marca("Ford", 20, 1901, "ford");
		Marca vw = new Marca("Wolkswagen", 20, 1928, "wolks");
		Carro carroDoJoao1 = 
				new Carro("Escort XR3", "amarela", 1996, ford, "SADS09D2E12E190",
						joao, 180, 2, true, 4, 45.0);
		Carro carroDoJoao2 = 
				new Carro("Fiesta", "branca", 2015, ford, "AADS09D2E12E190",
						joao, 150, 4, true, 4, 48.0);
		Carro carroDoJoao3 = 
				new Carro("Polo", "preta", 2019, vw, "FNEFN23198JN3K12",
						joao, 200, 4, false, 4, 52.0);
		
		venda.adicionar(carroDoJoao2);
		venda.adicionar(carroDoJoao3);
		venda.adicionar(carroDoJoao1);
		
		// QUANDO
//		Carro carroEscolhido = venda.obter(null);
//		
//		System.out.println(carroEscolhido);
		
		Carro carroDesejado = new Carro ("Polo", null, null, null, null, null, null, null, null, null, null);

		List<Carro> carrosEncontrados = venda.buscar(carroDesejado);
		
		for(Carro carro: carrosEncontrados) {
			System.out.println("achei esse carro aqui: " + carro);
		}
	}

}
