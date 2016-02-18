package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SolutionPrianka {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Integer v = sc.nextInt();
			list.add(v);
		}
		
		Collections.sort(list);
		
		
		Iterator<Integer> it = list.iterator();
		
		int counter = 1;
		Integer last = it.next();
		
		while(it.hasNext()){
			Integer v = it.next();
			if (v > (last +4)){
				last = v;
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}
