package ex04.test;

import ex04.app.Veiculo;
import ex04.app.Venda;
import ex04.app.Endereco;
import ex04.app.Marca;
import ex04.app.Proprietario;

public class ProprietarioTest {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("Rua Orfanotrófio", "Cristal", "Porto Alegre", "RS", "90000-000", "BLOCO C" );
		Proprietario prop1 = new Proprietario("Alessandro", "8918291", "9182910", end1);
		Marca marca1 = new Marca("Hyundai", 8, 1990, "HY");
		
		Veiculo carro = new Veiculo("HB20",
				"Branca",
				2019,
				marca1,
				"AS121321ASHD",
				prop1,
				150,
				4,
				5,
				Boolean.FALSE,
				Boolean.FALSE);
		
		Endereco end2 = new Endereco("Av Ipiranga", "Partenon", "Porto Alegre", "RS", "90000-000", "Predio 10" );
		Proprietario prop2 = new Proprietario("Joao", "11", "9182910", end2);
		Marca marca2 = new Marca("General Motors", 20, 1940, "GM");
		
		Veiculo carro2 = new Veiculo("Astra",
				"Preta",
				2000,
				marca2,
				"XAJSAKDAS",
				prop2,
				180,
				4,
				5,
				Boolean.TRUE,
				Boolean.FALSE);

		Endereco end3 = new Endereco("Av Protasio Alves", "Petropolis", "Porto Alegre", "RS", "90000-000", "sala 502" );
		Proprietario prop3 = new Proprietario("Maria", "12121", "9182910", end3);
		Marca marca3 = new Marca("Volkswagen", 20, 1920, "VW");
		
		Veiculo carro3 = new Veiculo("Golf",
				"Vermelha",
				2001,
				marca3,
				"WI12093J1",
				prop3,
				220,
				2,
				5,
				Boolean.FALSE,
				Boolean.FALSE);

		Endereco end4 = new Endereco("Rua Zé Ninguem", "Centro", "Porto Alegre", "RS", "90000-000", "-" );
		Proprietario prop4 = new Proprietario("Karla", "23180", "9182910", end4);
	
		Veiculo carro4 = new Veiculo("Polo",
				"Branca",
				2015,
				marca3,
				"12398701HU21",
				prop4,
				220,
				4,
				5,
				Boolean.FALSE,
				Boolean.FALSE);
		
		
		Venda venda = new Venda();
		venda.adicionarVeiculo(carro);
		venda.adicionarVeiculo(carro2);
		venda.adicionarVeiculo(carro3);
		venda.adicionarVeiculo(carro4);
		venda.listar();
		
		System.out.println("Resultado do obter " + venda.obterVeiculo("12398701HU21"));
		System.out.println("Resultado do obter " + venda.obterVeiculo("A"));
		
		for (Veiculo veiculo : venda.buscar(
				new Veiculo(null, "Branca", null, null, 
							null, null, null, 
							null, null, null,
							null))) {
			System.out.println("Resultado do buscar " + veiculo);
		}
		
	}

}
