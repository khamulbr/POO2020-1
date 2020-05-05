package ex02;

import java.util.ArrayList;
import java.util.List;

import ex02.conta.Conta;
import ex02.conta.TipoConta;

public class ContaTest {

	public static void main(String[] args) {

		Conta conta1 = new Conta("123", TipoConta.UNIVERSITARIA);
		conta1.depositar(100.0);
		conta1.sacar(25.95);
		
		Conta conta2 = new Conta("345", TipoConta.ULTRA_PLUS);
		conta2.depositar(1000.90);
		
		Conta conta3 = new Conta();
		conta3.depositar(10.90);

		Conta conta4 = new Conta();
		conta3.depositar(99.90);

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta3);
		contas.add(conta2);
		contas.add(conta4);
		contas.add(conta1);
		
		for (Conta conta: contas) {
			System.out.println(conta.toString() + " " + conta.hashCode());
		}
		

	}

}
