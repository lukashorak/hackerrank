package testAccel;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SolutionGreatestInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// int[] a = new int[N];
		SortedSet<Integer> set = new ConcurrentSkipListSet<>();
		for (int i = 0; i < N; i++) {
			// a[i] = sc.nextInt();
			set.add(sc.nextInt());
		}
		int M = sc.nextInt();


		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			int x = it.next();
			int add = 0;
			Iterator<Integer> it2 = set.iterator();
			while(it.hasNext()){
				int y = it.next();
				
				int z = Math.abs(x - y);
				if (!set.contains(z)){
					set.add(z);
					add++;
				}
			}
			if (add == 0){
				break;
			}
		}
		
		System.out.println(Arrays.toString(set.toArray()));
		System.out.println(set.toArray()[set.size()-M]);
	}

}
