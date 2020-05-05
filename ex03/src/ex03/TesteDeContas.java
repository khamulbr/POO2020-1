package ex03;

import ex02.conta.Conta;

public class TesteDeContas {

	public static void main(String[] args) {
	
		Conta conta = new Conta("numero");
		conta.depositar(100.0);
		System.out.println(conta.toString());
		
	}

}
