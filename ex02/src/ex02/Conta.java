package ex02;

public class Conta {
	
	private String numero;
	private Double saldo;
	
	public Conta(String numero){
		this.numero = numero;
		saldo = new Double(0);
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	@Override	
	public String toString(){
		return "O saldo atual da conta " + this.numero + " é " + this.saldo;		
	}
	

}
