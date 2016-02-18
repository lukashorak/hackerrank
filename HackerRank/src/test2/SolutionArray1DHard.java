package test2;

import java.util.*;

public class SolutionArray1DHard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			runCase(sc);
		}
	}

	public static void runCase(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];
		int[] arrV = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		List<Integer> steps = new ArrayList<>();
		steps.add(0);

		for (int r = 1; r < 1000; r++) {
			List<Integer> stepsNext = new ArrayList<>();
			for (Integer s : steps) {

				arrV[s] = r;
				int x_m1 = s - 1;
				int x_p1 = s + 1;
				int x_pM = s + M;

				if (x_p1 >= N || x_pM >= N) {
					System.out.println("YES");
					return;
				}

				if (x_m1 > 0 && arrV[x_m1] == 0 && arr[x_m1] == 0) {
					stepsNext.add(x_m1);
				}
				if (arrV[x_p1] == 0 && arr[x_p1] == 0) {
					stepsNext.add(x_p1);
				}
				if (arrV[x_pM] == 0 && arr[x_pM] == 0) {
					stepsNext.add(x_pM);
				}
			}

			steps = stepsNext;

			if (steps.size() == 0) {
				System.out.println("NO");
				return;
			}
		}

	}
}
