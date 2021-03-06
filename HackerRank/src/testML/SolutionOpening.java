package testML;

import java.util.Scanner;

public class SolutionOpening {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] A = new int[9][10];

		for (int y = 0; y < 9; y++) {
			String line = sc.nextLine();
			for (int x = 0; x < 10; x++) {
				A[y][x] = Integer.valueOf(line.charAt(x) + "");
			}
		}

		int[][] B = erosion(A);
		int[][] C = dilation(B);

		long sum = sum(C);

		System.out.print(sum);
	}

	public static long sum(int[][] B) {
		long sum = 0;
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 10; x++) {
				sum += B[y][x];
				System.out.print(B[y][x]);
			}
			System.out.println();
		}
		return sum;
	}

	public static int[][] dilation(int[][] A) {

		int[][] B = new int[9][10];
		for (int y = 1; y < 8; y++) {
			for (int x = 1; x < 9; x++) {

				int v = A[y][x];

				if (v == 1) {

					B[y - 1][x - 1] = v;
					B[y - 1][x] = v;
					B[y - 1][x + 1] = v;
					B[y][x - 1] = v;
					B[y][x] = v;
					B[y][x + 1] = v;
					B[y + 1][x - 1] = v;
					B[y + 1][x] = v;
					B[y + 1][x + 1] = v;
				}
			}
		}

		return B;
	}

	public static int[][] erosion(int[][] A) {
		int[][] B = new int[9][10];

		for (int y = 1; y < 8; y++) {
			for (int x = 1; x < 9; x++) {

				int v = A[y][x];

				if (v == 1) {

					int sum = 0;
					sum += A[y - 1][x - 1];
					sum += A[y - 1][x];
					sum += A[y - 1][x + 1];
					sum += A[y][x - 1];
					sum += A[y][x];
					sum += A[y][x + 1];
					sum += A[y + 1][x - 1];
					sum += A[y + 1][x];
					sum += A[y + 1][x + 1];

					if (sum == 9) {

						// B[y - 1][x - 1] = v;
						// B[y - 1][x] = v;
						// B[y - 1][x + 1] = v;
						// B[y][x - 1] = v;
						B[y][x] = v;
						// B[y][x + 1] = v;
						// B[y + 1][x - 1] = v;
						// B[y + 1][x] = v;
						// B[y + 1][x + 1] = v;
					}
				}
			}

		}
		return B;
	}

}
