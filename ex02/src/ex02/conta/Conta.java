package ex02.conta;

public class Conta {
	
	private String numero;
	private Double saldo;
	private TipoConta tipoConta;
	
	public Conta(){
		this("sem número", TipoConta.PADRAO);
	}
	
	public Conta(String numero, TipoConta tipoConta){
		this.numero = numero;
		this.tipoConta = tipoConta;
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
		return "O saldo atual da conta " + this.numero + " de tipo "+ this.tipoConta + " é " + this.saldo;		
	}
	

}
