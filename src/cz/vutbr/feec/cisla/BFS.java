package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciePole zadani) {
		LinkedList<HraciePole> open = new LinkedList<HraciePole>();
		
		// Zavislost vykonu BFS na roznych datovych strukturach
		HashSet<HraciePole> closed = new HashSet<HraciePole>();
		//TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		//LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
		open.addFirst(zadani);
		while (!open.isEmpty()) {
			HraciePole tmp = open.removeLast();
			if(tmp.jeReseni()) {
				System.out.println("Riesenie vyhladane "+tmp);
				return;
			}
			for (int i = 1; i <= 4; i++) {
				HraciePole nove = tmp.klonujAPohni(i);
				if(nove != null && !closed.contains(nove)) {
					open.addFirst(nove);
					closed.add(nove);			
				}
			}
		}
		System.out.println("Riesenie neexistuje");
	}
}
