package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generator2 implements IGenerator{

	public Generator2(int size) {
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
		Generator2 g = new Generator2(100000);
		Long start = System.currentTimeMillis();
		g.run();
		Long end = System.currentTimeMillis();
		System.out.println("Duration (" + g.size + "): cycle:\t" + g.cycle
				+ " time:\t" + (end - start));
	}

public void run() {

		while (used.size() < size) {
			cycle++;
			
			int r = random.nextInt(in.size());
			Integer v = in.get(r);
			
			if (!used.contains(v)) {
				in.remove(r);
				used.add(v);
			}
//			System.out.println("Cycle:\t" + cycle);
		}

	}

}
