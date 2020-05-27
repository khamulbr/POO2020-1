package atividade02;

public class Pessoa implements Professor, Cidadao, Contribuinte {

	private String nome;
	private Integer rg;
	private boolean pagarIR = false;
	private String cpf;
	private Integer numeroDeContrato;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	@Override
	public void trabalha() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean pagarIR() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Pessoa [numeroDeContrato = " + numeroDeContrato + ", nome=" + nome + ", rg=" + rg + ", pagarIR=" + pagarIR + ", cpf=" + cpf + "]";
	}

	@Override
	public String getCPF() {
		return cpf;
	}

	@Override
	public void vota() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getRG() {
		return rg;
	}

	@Override
	public void ensina() {
		// TODO Auto-generated method stub

	}

	public void registrar(Integer rg) throws EmptyRGException {
		if (rg==null)
			throw new EmptyRGException("O RG não pode ser nulo");
		this.rg = rg;
	}

	public void ehContribuinteAtivo() {
		this.pagarIR  = true;		
	}

	public void contratar(Integer numero) {
		this.numeroDeContrato = numero;		
	}

	
	
}
