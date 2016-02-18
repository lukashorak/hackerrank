package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SolutionJesseCookies {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("JesseCookies.in");
		Scanner sc = new Scanner(file);

		int N = sc.nextInt();
		int K = sc.nextInt();

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			queue.add(sc.nextInt());
		}
		
		int c = 0;
		while (queue.peek() < K){
			c++;
			Integer i1 = queue.poll();
			Integer i2 = queue.poll();
			
			if (i2 == null){
				if (i1 < K){
					c = -1;
					break;
				}
			}
			
			int v = i1 + 2*i2;
			queue.add(v);
		}
		
		System.out.println(c);
	}

}
