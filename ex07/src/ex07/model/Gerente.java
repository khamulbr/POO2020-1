package ex07.model;

public class Gerente extends Funcionario implements AumentadorDeSalario {

	@Override
	public void setBonificacao(Double bonificacao) {
		super.setBonificacao(bonificacao * 2);
	}

	@Override
	public void fornecerAumento(Double percentual) {
		super.salario = salario * percentual;		
	}
	
	public Double meDa100Real() {
		return 0.00;
	}
	
}
