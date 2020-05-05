package ex04.app;

public class Marca {
	
	String nome;
	Integer nrDeModelos;
	Integer anoDeLancamento;
	String codigoIdentificador;
	
	public Marca(String nome, Integer nrDeModelos, Integer anoDeLancamento, String codigoIdentificador) {
		super();
		this.nome = nome;
		this.nrDeModelos = nrDeModelos;
		this.anoDeLancamento = anoDeLancamento;
		this.codigoIdentificador = codigoIdentificador;
	}

	@Override
	public String toString() {
		return "Marca [nome=" + nome + ", nrDeModelos=" + nrDeModelos + ", anoDeLancamento=" + anoDeLancamento
				+ ", codigoIdentificador=" + codigoIdentificador + "]";
	}


}
