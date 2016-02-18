package testML;

import java.util.Scanner;

public class SolutionComputingCorrelation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double sumA = 0D;
		double sumSqA = 0D;

		double sumB = 0D;
		double sumSqB = 0D;

		double sumC = 0D;
		double sumSqC = 0D;

		double sumAB = 0D;
		double sumBC = 0D;
		double sumAC = 0D;

		for (int n = 0; n < N; n++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			sumA += a;
			sumB += b;
			sumC += c;

			sumSqA += Math.pow(a, 2);
			sumSqB += Math.pow(b, 2);
			sumSqC += Math.pow(c, 2);

			sumAB += a * b;
			sumBC += b * c;
			sumAC += a * c;
		}

		double rhoAB = ((double) N * sumAB - sumA * sumB)
				/ (Math.sqrt((double) N * sumSqA - Math.pow(sumA, 2)) * Math
						.sqrt((double) N * sumSqB - Math.pow(sumB, 2)));
		double rhoBC = ((double) N * sumBC - sumB * sumC)
				/ (Math.sqrt((double) N * sumSqB - Math.pow(sumB, 2)) * Math
						.sqrt((double) N * sumSqC - Math.pow(sumC, 2)));
		double rhoAC = ((double) N * sumAC - sumA * sumC)
				/ (Math.sqrt((double) N * sumSqA - Math.pow(sumA, 2)) * Math
						.sqrt((double) N * sumSqC - Math.pow(sumC, 2)));

		System.out.printf("%.2f\n", rhoAB);
		System.out.printf("%.2f\n", rhoBC);
		System.out.printf("%.2f\n", rhoAC);
	}

}
