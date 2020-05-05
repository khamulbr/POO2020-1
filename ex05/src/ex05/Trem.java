package ex05;

import java.util.List;

public class Trem {
	
	private EstradaDeFerro estradaDeFerro;
	private Locomotiva locomotiva;
	private List<Vagao> vagoes;
	
	public Trem(Locomotiva locomotiva, List<Vagao> vagoes){
		if (locomotiva!=null)
			this.locomotiva = locomotiva;
		if (vagoes!=null && !vagoes.isEmpty())
			this.vagoes = vagoes;
	}

	@Override
	public String toString() {
		return "Trem [estradaDeFerro=" + estradaDeFerro + ", locomotiva=" + locomotiva + ", vagoes=" + vagoes + "]";
	}
	
	public void andarEm(EstradaDeFerro estradaDeFerro){
		this.estradaDeFerro = estradaDeFerro;
	}
	

}
