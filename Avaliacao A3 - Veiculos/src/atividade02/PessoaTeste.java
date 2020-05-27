package atividade02;

import java.util.ArrayList;
import java.util.List;

public class PessoaTeste{

	public static void main(String[] args) {
		List<Pessoa> contratados = new ArrayList<Pessoa>();

		Pessoa pessoa1 = new Pessoa("João");
		Pessoa pessoa2 = new Pessoa("Maria");
		Pessoa pessoa3 = new Pessoa("José");
		
		try {
			pessoa1.registrar(1190101211);
		} catch (EmptyRGException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pessoa2.registrar(1289012111);
		} catch (EmptyRGException e) {
			System.out.println(e.getMessage());

		}
		
		try {
			pessoa3.registrar(null);
		} catch (EmptyRGException e) {
			System.out.println(e.getMessage() + " em " + pessoa3.toString());
		}
		
		pessoa1.ehContribuinteAtivo();
		pessoa3.ehContribuinteAtivo();
		
		pessoa1.contratar(1);
		
		contratados.add(pessoa1);
		contratados.add(pessoa2);
		contratados.add(pessoa3);
		
		for(Pessoa pessoa: contratados) {
			System.out.println(pessoa.toString());
		}
	}

}
