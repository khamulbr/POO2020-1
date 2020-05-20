package com.vehiclesales.business;

import java.util.ArrayList;
import java.util.List;

import com.vehiclesales.model.Carro;
import com.vehiclesales.model.Endereco;
import com.vehiclesales.model.Marca;
import com.vehiclesales.model.Proprietario;

public class Venda {
	
	private List<Carro> carros = new ArrayList<Carro>();

	public void adicionar(Carro carro) {
		carros.add(carro);		
	}

	public int getNumeroDeCarros() {
		return carros.size();
	}

	public Carro obter(String chassis) {
		for (Carro carro: carros) {
			if (carro.getChassi().equals(chassis))
				return carro;
		}
		return null;
	}

}
