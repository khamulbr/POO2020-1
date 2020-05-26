package com.vehiclesales.business;

import java.util.ArrayList;
import java.util.List;

import com.vehiclesales.model.Carro;
import com.vehiclesales.model.Endereco;
import com.vehiclesales.model.Marca;
import com.vehiclesales.model.Proprietario;

public class Venda {
	
	List<Carro> carros = new ArrayList<Carro>();

	public void adicionar(Carro carro) {
		carros.add(carro);		
	}

	public int getNumeroDeCarros() {
		return carros.size();
	}

	public Carro obter(String chassis) {
		if (chassis==null)
			return null;

		for (Carro carro: carros) {
			if (carro.getChassi().equals(chassis))
				return carro;
		}
		return null;
	}
	
	public List<Carro> buscar(Carro carroConsultado) {
		List<Carro> carrosEncontrados = new ArrayList<Carro>();
		
		if (carroConsultado==null)
			return carrosEncontrados;		
		
		for (Carro carro: carros) {
			boolean achouOCarro = false;

			if (carroConsultado.getModelo()!=null && carro.getModelo().equals(carroConsultado.getModelo()))
				achouOCarro = true;
			if (carroConsultado.getCor()!=null && carro.getCor().equals(carroConsultado.getCor()))
				achouOCarro = true;
			if (carroConsultado.getAno()!=null && carro.getAno().equals(carroConsultado.getAno()))
				achouOCarro = true;
			if (carroConsultado.getMarca()!=null && carro.getMarca().equals(carroConsultado.getMarca()))
				achouOCarro = true;
			if (carroConsultado.getChassi()!=null && carro.getChassi().equals(carroConsultado.getChassi()))
				achouOCarro = true;
			if (carroConsultado.getProprietario()!=null && carro.getProprietario().equals(carroConsultado.getProprietario()))
				achouOCarro = true;
			if (carroConsultado.getVelocidadeMaxima()!=null && carro.getVelocidadeMaxima().equals(carroConsultado.getVelocidadeMaxima()))
				achouOCarro = true;
			if (carroConsultado.getNumeroDePortas()!=null && carro.getNumeroDePortas().equals(carroConsultado.getNumeroDePortas()))
				achouOCarro = true;
			if (carroConsultado.getTemTetoSolar()!=null && carro.getTemTetoSolar().equals(carroConsultado.getTemTetoSolar()))
				achouOCarro = true;
			
			if (achouOCarro)
				carrosEncontrados.add(carro);		

		}
		
		return carrosEncontrados;
	}

}
