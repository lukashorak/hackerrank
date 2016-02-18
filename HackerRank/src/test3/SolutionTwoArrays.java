package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SolutionTwoArrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			List<Integer> A = new ArrayList<>();
			List<Integer> B = new ArrayList<>();

			for (int n = 0; n < N; n++) {
				Integer a = sc.nextInt();
				A.add(a);
			}
			for (int n = 0; n < N; n++) {
				Integer b = sc.nextInt();
				B.add(b);
			}

			Collections.sort(A);
			Collections.reverse(A);
			Collections.sort(B);
//			Collections.reverse(B);

			for (int i = 0; i < N; i++) {

				int valueA = A.get(i);

				Iterator<Integer> it = B.iterator();
				while (it.hasNext()) {
					int valueB = it.next();
					if (valueA + valueB >= K){
						it.remove();
						break;
					}
				}

			}

			if (B.size() > 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

		}

	}
}
