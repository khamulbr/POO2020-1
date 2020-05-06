package ex07.model;

public class Gerente extends Funcionario {

	@Override
	public void setBonificacao(Double bonificacao) {
		super.setBonificacao(bonificacao * 2);
	}
	
}
