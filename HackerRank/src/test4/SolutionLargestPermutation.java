package test4;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionLargestPermutation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		int[] index = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			index[a[i]] = i;
		}
		for (int i = 0; i < n; i++) {
			if (a[i] == n - i) {
				continue;
			}
			a[index[n - i]] = a[i];
			index[a[i]] = index[n - i];
			a[i] = n - i;
			index[n - i] = i;
			k--;
			if (k == 0){
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {

			for (int x = 0; x < n; x++) {
				int v = a[x];
				int max = a[x];
				int maxPos = x;
				for (int p = (n - 1); p >= x; p--) {
					if (a[p] > max) {
						max = a[p];
						maxPos = p;
					}
				}

				if (max > v) {
					a[x] = max;
					a[maxPos] = v;
					break;
				}
			}
		}

		// System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
