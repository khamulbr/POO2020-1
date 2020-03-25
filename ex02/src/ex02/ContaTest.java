package ex02;

public class ContaTest {

	public static void main(String[] args) {
		Conta conta1 = new Conta("123");
		System.out.println(conta1.toString());
		conta1.depositar(100.0);
		System.out.println(conta1.toString());
		
		Conta conta2 = new Conta("345");
		System.out.println(conta2.toString());
		conta2.depositar(1000.90);
		System.out.println(conta2.toString());

		conta1.sacar(25.95);
		System.out.println(conta1.toString());
	}

}
