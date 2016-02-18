package test3;

import java.util.Scanner;

public class SolutionManasaStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt() -1;
			int x = sc.nextInt();
			int y = sc.nextInt();

			int a = Math.min(x, y);
			int b = Math.max(x, y);

			int current = a * n;
			int max = b * n;
			int difference = b - a;
			if (a == b) {
				System.out.println(current);
			} else {
				StringBuilder ansString = new StringBuilder();
				while (current <= max) {
					ansString.append(current + " ");
					current += difference;
				}
				System.out.println(ansString);
			}
		}
	}
}
