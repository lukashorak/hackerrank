package test2;

import java.util.Scanner;

public class SolutionCavity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int g[][] = new int[n][n];
		int o[][] = new int[n][n];
		for (int y = 0; y < n; y++) {
			String line = sc.next();
			for (int x = 0; x < n; x++) {
				g[y][x] = Integer.valueOf("" + line.charAt(x));
				o[y][x] = g[y][x];
			}
		}

		for (int y = 1; y < n - 1; y++) {
			for (int x = 1; x < n - 1; x++) {
				if ((g[y][x] > g[y - 1][x]) && (g[y][x] > g[y + 1][x])
						&& (g[y][x] > g[y][x - 1]) && (g[y][x] > g[y][x + 1])) {
					o[y][x] = -1;
				}
			}
		}

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < n; x++) {
				if (o[y][x] == -1) {
					System.out.print("X");
				} else {
					System.out.print(o[y][x]);
				}
			}
			System.out.println();
		}
	}

}
