	package ex10;

public class Strings {

	public static void main(String[] args) {
		String um = "Um";
		String dois = "Um";
		
		if (um == dois) {
			System.out.println("sao iguais mesmo, ora veja!");
		}
		
		String tres = new String("Um");
		if (um != tres)
			System.out.println("um e tres não são Um");

		
		Integer one = 1;
		Integer two = 1;		
		
		if (one == two) {
			System.out.println("they are the same!");
		}

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("início do texto");
		StringBuffer sb3 = new StringBuffer(40);

		sb3.append('a');
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());

		
	}

}
