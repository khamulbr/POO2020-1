package ex10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.SortedSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("Um");
		hs.add("Dois");
		
		System.out.println(hs);

		hs.add("Um");
		
		System.out.println(hs);

		
		Pessoa p1 = new Pessoa("1281902801","Joao", 30);
		
		hs.add(p1);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(p1));
		
		Iterator it1 = hs.iterator();
		
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		hs.add("Tres");
		
		it1 = hs.iterator();
		
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(3);
		lhs.add(1000);
		lhs.add(-1);
		
		System.out.println(lhs);
		
		lhs.add("A");
		
		System.out.println(lhs);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(-1000);
		pq.add(20);
		pq.add(-1);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		pq.add(1000);
		System.out.println(pq.peek());
	
		Pessoa p2 = new Pessoa("20102931","Maria", 21);
		Pessoa p3 = new Pessoa("23412912431","José", 10);
		Pessoa p4 = new Pessoa("242874112","Chico", 44);
		Pessoa p5 = new Pessoa("1248191281","Maria", 20);

		HashMap hm = new HashMap();
		hm.put(p1.getNome(), p1);
		hm.put(p2.getNome(), p2);
		hm.put(p3.getNome(), p3);
		hm.put(p4.getNome(), p4);
		hm.put(p5.getNome(), p5);
		
		System.out.println(hm);
		
		Pessoa pessoaEncontrada = (Pessoa) hm.get("Maria");
		
		System.out.println(pessoaEncontrada);
		
		
		hm.remove("Maria");
		
		System.out.println(hm);
		
		if (hm.containsValue(p3)) {
			System.out.println("José ainda está aqui");
		}
		
		System.out.println(hm.keySet().toArray().toString());
		System.out.println(hm.values().toArray().toString());

		
		
	}

}
