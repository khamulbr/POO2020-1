import com.vehiclesales.model.Carro;
import com.vehiclesales.model.Endereco;
import com.vehiclesales.model.Marca;
import com.vehiclesales.model.Proprietario;

public class VeiculoTest {

	public static void main(String[] args) {
		Endereco enderecoJoao = 
				new Endereco("rua 1", "bairro 1", "cidade 1", "RS", "90121-010", "casa 2");
		
		Proprietario joao = 
				new Proprietario("João", "21983209", "98292381", enderecoJoao);

		Marca ford = new Marca("Ford", 20, 1901, "ford");
		
		Carro carroDoJoao = 
				new Carro("Escort XR3", "amarela", 1996, ford, "SADS09D2E12E190",
						joao, 180, 2, true, 4, 45.0);
		
		System.out.println(carroDoJoao);
		
		carroDoJoao.aumentaMarcha();
		for (int i =0; i< 20; i++ )
			carroDoJoao.aumentaVelocidade();
		System.out.println(carroDoJoao);
		
		carroDoJoao.aumentaMarcha();
		for (int i =0; i< 20; i++ )
			carroDoJoao.aumentaVelocidade();
		
		System.out.println(carroDoJoao);
		
		carroDoJoao.aumentaMarcha();
		for (int i =0; i< 20; i++ )
			carroDoJoao.aumentaVelocidade();
		
		System.out.println(carroDoJoao);

		System.out.println(carroDoJoao.autonomia(12.0));
		
		carroDoJoao.frear();

		System.out.println(carroDoJoao);
		
		carroDoJoao.reduzMarcha();
		
		System.out.println(carroDoJoao);
		
		carroDoJoao.reduzMarcha();
		
		System.out.println(carroDoJoao);
		
		carroDoJoao.reduzMarcha();
		
		System.out.println(carroDoJoao);
		
		carroDoJoao.reduzMarcha();
		
		System.out.println(carroDoJoao);

		carroDoJoao.reduzMarcha();
		
		System.out.println(carroDoJoao);

		
	}

}
