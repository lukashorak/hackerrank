package test2;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionDownToZero {

	public static int largestPrimeFactor(long number) {
		int i;
		long copyOfInput = number;

		for (i = 2; i <= copyOfInput; i++) {
			if (copyOfInput % i == 0) {
				copyOfInput /= i;
				i--;
			}
		}
		return i;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();
		for (int q = 0; q < Q; q++) {
			int N = sc.nextInt();

			int steps = 0;
			while (N > 0) {
				steps++;
				//FIXME - 2 minimal numbers
				int lpf = largestPrimeFactor(N);
				if (lpf < N && lpf > 1) {
					int b = N / lpf;
					N = Math.max(lpf, b);
				} else {
					N--;
				}
			}
			System.out.println(steps);

		}

	}
}
