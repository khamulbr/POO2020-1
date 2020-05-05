package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TremTests {

	public static void main(String[] args) {
		Locomotiva locomotiva = new Locomotiva();
		
		//List<Vagao> vagoes = Arrays.asList(new Vagao(), new Vagao(), new Vagao());
		
		List<Vagao> vagoes = new ArrayList<Vagao>();
		vagoes.add(new Vagao(1));
		vagoes.add(new Vagao(2));
		vagoes.add(new Vagao(3));
		vagoes.add(new Vagao(4));
		vagoes.add(new Vagao(5));
		
		Trem trem = new Trem(locomotiva, vagoes);
		
		System.out.println(trem.toString());
		
		trem.andarEm(new EstradaDeFerro());
		
		System.out.println(trem.toString());

		trem.andarEm(new EstradaDeFerro());

		System.out.println(trem.toString());

		Locomotiva locoVap = new LocomotivaAVapor();
		Locomotiva locoEle = new LocomotivaEletrica();
		locoVap.acelerar();
		locoVap.frear();
		
		locoEle.acelerar();
		locoEle.frear();
	}

}
