package ex04.app;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();

	public void adicionarVeiculo(Veiculo veiculoASerAdicionado){
		veiculos.add(veiculoASerAdicionado);
		System.out.println("Veiculo " + veiculoASerAdicionado.getChassi() + " adicionado com sucesso ao cadastro");
	}
	
	public Veiculo obterVeiculo(String chassi){
		for (Veiculo veiculo: veiculos){
			if (veiculo.getChassi().equals(chassi)) {
				return veiculo;
			}
		}
		return null;		
	}
	
	public List<Veiculo> buscar(Veiculo veiculoASerPesquisado){
		List<Veiculo> veiculosEncontrados = new ArrayList<Veiculo>();
		for (Veiculo veiculo: veiculos){
			if (veiculoASerPesquisado.getChassi()!=null && 
					veiculo.getChassi().equals(veiculoASerPesquisado.getChassi())){
				veiculosEncontrados.add(veiculo);
			}
			if (veiculoASerPesquisado.getCor()!=null && 
					veiculo.getCor().equals(veiculoASerPesquisado.getCor())){
				veiculosEncontrados.add(veiculo);
			}
		}
		return veiculosEncontrados;		
	}
	
	public void listar(){
		for (Veiculo veiculo: veiculos){
			System.out.println("Veiculo cadastrado " + veiculo);
		}
	}
	
}
