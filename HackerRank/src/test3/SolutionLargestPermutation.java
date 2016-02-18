package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SolutionLargestPermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		sc.nextLine();

		int[] A = new int[N];

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			list.add(A[i]);
		}

		Collections.sort(list);
		Collections.reverse(list);

		for (int i = 0; i < K; i++) {

			int v = A[i];

			int max = A[N-1];
			int posMax = N-1;
			for (int x = N - 1; x > i; x--) {
				
				
				
			}
		}

	}
}
