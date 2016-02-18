package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SolutionSherlockArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();

			List<Integer> A = new ArrayList<>();

			int sumLeft = 0;
			int sumRight = 0;
			for (int n = 0; n < N; n++) {
				Integer a = sc.nextInt();
				A.add(a);
				sumRight += a;
			}
			
			sumRight -= A.get(0);
			if (sumLeft == sumRight){
				System.out.println("YES");
				continue;
			}
			
			for (int i = 1; i < N; i++) {

				
				sumRight -= A.get(i);
				sumLeft += A.get(i-1);

				if (sumLeft == sumRight) {
					break;
				}
			}

			if (sumLeft == sumRight) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}

	}

}
