package ex05;

public class Vagao {

	private Integer numero;
	
	public Vagao(Integer numero) {
		super();
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Vagao [numero=" + numero + "]";
	}
}
