package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			sc.nextLine();
			int M = sc.nextInt();
			sc.nextLine();
			int N = sc.nextInt();
			sc.nextLine();

			int[] c = new int[N];
			for (int i = 0; i < N; i++) {
				c[i] = sc.nextInt();
			}

			boolean found = false;
			for (int i = 0; i < N; i++) {
				int x = c[i];
				int diff = M - x;

				for (int j = (i + 1); j < N; j++) {
					if (j == i)
						continue;
					if (c[j] == diff) {
						System.out.print((i + 1) + " " + (j + 1));
						found = true;
						break;
					}
				}

				if (found)
					break;

			}

			System.out.println();
		}
	}

}
