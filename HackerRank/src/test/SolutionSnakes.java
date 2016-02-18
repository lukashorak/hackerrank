package test;

import java.util.*;
import java.util.Scanner;

public class SolutionSnakes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tt = 0; tt < T; tt++) {

			HashMap<Integer, Integer> map = new HashMap<>();
			int L = sc.nextInt();
			for (int l = 0; l < L; l++) {
				int f = sc.nextInt();
				int t = sc.nextInt();
				map.put(f-1, t-1);
			}

			int S = sc.nextInt();
			for (int s = 0; s < S; s++) {
				int f = sc.nextInt();
				int t = sc.nextInt();
				map.put(f-1, t-1);
			}

			int[] arr = new int[110];

			arr[0] = 1;
			int step = 0;
			while (arr[99] == 0) {
				//printArray(arr);
				step++;
				ArrayList<Integer> field = new ArrayList<Integer>();
				for (int i = 0; i < 100; i++) {
					if (arr[i] == step) {
						field.add(i);
					}
				}

				for (int f : field) {
					for (int d = 1; d <= 6; d++) {
						int p = f + d;
						Integer t = map.get(p);
						if (t != null) {
							if (arr[t] == 0) {
								arr[t] = step + 1;
							}
						} else {
							if (arr[p] == 0) {
								arr[p] = step + 1;
							}
						}
					}
				}
				
				if (step > 100){
					step = -1;
					break;
				}

			}

			System.out.println(step);
		}
	}

	public static void printArray(int[] arr) {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(arr[y * 10 + x] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
