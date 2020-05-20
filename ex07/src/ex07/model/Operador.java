package ex07.model;

public class Operador extends Funcionario implements Incomodador {
	
	@Override
	public void setBonificacao(Double bonificacao) {
		super.setBonificacao(bonificacao * 0.5);
	}

	public void opera() {
		System.out.println("estou operando!");
	}

	@Override
	public String soPraIncomodar() {
		// TODO Auto-generated method stub
		return null;
	}

}
