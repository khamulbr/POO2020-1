package ex05;

public class Locomotiva {

	private Farol farol;
	
	public Locomotiva(){
		super();
	}
	
	public Locomotiva(Farol farol){
		this.farol = farol;
	}
	
	public void acelerar(){
		System.out.println("acelerou normal");
	}
	
	public void frear(){
		System.out.println("freou normal");
	}
}
