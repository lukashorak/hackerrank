package test4;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionSherlockWatson {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[N];
		for (int i = 0; i < N; i++) {
			int p2 = (i + K) % N;
			arr2[p2] = arr[i];
		}

		// System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(arr2));

		for (int i = 0; i < Q; i++) {
			int q = sc.nextInt();
			int v = arr2[q];
			System.out.println(v);
		}
	}

}
