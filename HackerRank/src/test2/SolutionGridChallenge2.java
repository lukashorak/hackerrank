package test2;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionGridChallenge2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			sc.nextLine();

			char[][] A = new char[N][N];

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLine().toCharArray();

				Arrays.sort(A[i]);
			}

			boolean sorted = true;
			for (int i = 1; i < N; i++) {
				for (int x = 0; x < N; x++) {
					if (A[i-1][x] > A[i][x]){
						sorted = false;
					}
				}
			}
			if (sorted) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
