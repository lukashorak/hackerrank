package testEuler;

import java.util.Scanner;

public class SolutionEuler1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int v = sc.nextInt();

			
			long sum;
			int x3_count = 1 + (v / 3);
			int x3_max = x3_count * 3;
			long x3_sum = x3_max * x3_count / 2;
			
			int x5_count = 1 + (v / 5);
			int x5_max = x5_count * 5;
			long x5_sum = x5_max * x5_count / 2;

			int x15_count = 1 + (v / 15);
			int x15_max = x15_count * 15;
			long x15_sum = x15_max * x15_count / 2;
		
			sum = x3_sum + x5_sum - x15_sum;

			System.out.println(sum);
		}
	}
}
