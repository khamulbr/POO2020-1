package ex07.controller;

import java.util.ArrayList;
import java.util.List;

import ex07.model.Funcionario;
import ex07.model.Secretaria;

public class ControleBonificacoes {

	List<Funcionario> funcionariosBonificados = new ArrayList<Funcionario>();
	
	public Double getTotalBonificacoes(){
		Double totalBonificacoes = 0.0;
		
		for (Funcionario funcionario: funcionariosBonificados) {
			totalBonificacoes  += funcionario.getBonificacao();
		}
		
		return totalBonificacoes;
	}
	
	public void registraBonificacao(Funcionario funcionario){
		funcionariosBonificados.add(funcionario);
	}

}
