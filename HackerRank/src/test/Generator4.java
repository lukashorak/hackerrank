package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generator4 implements IGenerator{

	public Generator4(int size) {
		this.size = size;
		for (int i = 0; i < size; i++) {
			in.add(i);
		}
	}

	int size;
	int cycle = 0;
	List<Integer> in = new ArrayList<Integer>();
	Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator4 g = new Generator4(100000);
		Long start = System.currentTimeMillis();
		g.run();
		Long end = System.currentTimeMillis();
		System.out.println("Duration (" + g.size + "): cycle:\t" + g.cycle
				+ " time:\t" + (end - start));
	}

	public void run() {

		Collections.shuffle(in, random);

		for (int i = 0; i < in.size(); i++) {
			cycle++;

//			System.out.println("Cycle:\t" + cycle);
		}

	}

}
