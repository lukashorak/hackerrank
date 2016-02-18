package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			sc.nextLine();
			int N = sc.nextInt();
			sc.nextLine();

			int[] a = new int[N];
			long sumC = 0;
			boolean pos = false;
			long sumN = 0;

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				if (a[i] > 0) {
					sumN += a[i];
					pos = true;
				}
			}

			if (!pos) {
				sumN = a[0];
				for (int i = 0; i < N; i++) {
					sumN = Math.max(sumN, a[i]);
				}
			}
			sumC = maxSubArraySum(a);

			System.out.println(sumC + " " + sumN);
		}

	}

	static long maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

}
