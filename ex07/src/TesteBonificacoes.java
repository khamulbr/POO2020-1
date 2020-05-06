import ex07.controller.ControleBonificacoes;
import ex07.model.Funcionario;
import ex07.model.Gerente;
import ex07.model.Secretaria;
import ex07.model.SecretariaAdministrativa;
import ex07.model.SecretariaExecutiva;
import ex07.model.Supervisor;

public class TesteBonificacoes {

	public static void main(String[] args) {
		ControleBonificacoes ctb = new ControleBonificacoes();
		
		Funcionario sup1 = new Supervisor();
		sup1.setNome("João");
		sup1.setCpf("841903481093");
		sup1.setBonificacao(1000.0);
		
		Funcionario ge1 = new Gerente();
		ge1.setNome("Pedro");
		ge1.setCpf("2938412094");
		ge1.setBonificacao(5000.0);
		
		Funcionario sa1 = new SecretariaAdministrativa();
		sa1.setNome("Maria");
		sa1.setCpf("2983129301");
		sa1.setBonificacao(2000.0);
		
		Funcionario se1 = new SecretariaExecutiva();
		se1.setNome("Júlia");
		se1.setCpf("32434232423");
		((Secretaria) se1).setChefia(ge1);
		se1.setBonificacao(1500.0);
		
		ctb.registraBonificacao(sup1);
		ctb.registraBonificacao(ge1);
		ctb.registraBonificacao(sa1);
		ctb.registraBonificacao(se1);
		
		System.out.println(ctb.getTotalBonificacoes());

	}

}
