package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generator1 implements IGenerator {

	public Generator1(int size) {
		this.size = size;
		for (int i = 0; i < size; i++) {
			in.add(i);
		}
	}

	int size;
	int cycle = 0;
	List<Integer> in = new ArrayList<Integer>();
	Set<Integer> used = new TreeSet<Integer>();
	Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator1 g = new Generator1(100000);
		Long start = System.currentTimeMillis();
		g.run();
		Long end = System.currentTimeMillis();
		System.out.println("Duration (" + g.size + "): cycle:\t" + g.cycle
				+ " time:\t" + (end - start));
	}

	public void run() {

		while (used.size() < size) {
			cycle++;
			int r = random.nextInt(size);
			Integer v = in.get(r);
			if (!used.contains(v)) {
				used.add(v);
			}
//			System.out.println("Cycle:\t" + cycle);
		}

	}

}
