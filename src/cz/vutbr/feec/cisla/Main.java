package cz.vutbr.feec.cisla;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		HraciePole h = new HraciePole();
		for (int i = 0; i < 10000; i++) {
			h.pohni(new Random().nextInt(4) + 1);
		}
			System.out.println(h);
		BFS bfs = new BFS();
		bfs.vypisTahy(h);
	}
}
