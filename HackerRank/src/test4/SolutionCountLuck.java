package test4;

import java.util.Scanner;

public class SolutionCountLuck {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			run();
		}
	}

	public static void run() {

		int Y = sc.nextInt();
		int X = sc.nextInt();
		sc.nextLine();

		char[][] a = new char[Y][X];

		int h_x = 0;
		int h_y = 0;
		for (int y = 0; y < Y; y++) {
			String s = sc.nextLine();
			a[y] = s.toCharArray();
			for (int x = 0; x < X; x++) {
				if (a[y][x] == 'M') {
					h_x = x;
					h_y = y;
				}

			}
		}

		int K = sc.nextInt();
		move(a, X, Y, K, h_x, h_y, 0, 0);

	}

	public static void move(char[][] a, int X, int Y, int K, int h_x, int h_y,
			int last_dir, int turn) {

		if ((h_y >= 0 && h_y < Y) && (h_x >= 0 && h_x < X)) {
			
			if (a[h_y][h_x] == 'X' || a[h_y][h_x] == '-'){
				return;
			}

			if (a[h_y][h_x] == '*') {
				
				System.out.println(turn);
				return;
			}
			a[h_y][h_x] = '-';

			if (last_dir == 0) {
				move(a, X, Y, K, h_x - 1, h_y, 0, turn);
			} else {
				move(a, X, Y, K, h_x - 1, h_y, 0, turn++);
			}

			if (last_dir == 1) {
				move(a, X, Y, K, h_x + 1, h_y, 1, turn);
			} else {
				move(a, X, Y, K, h_x + 1, h_y, 1, turn++);
			}

			if (last_dir == 2) {
				move(a, X, Y, K, h_x, h_y - 1, 2, turn);
			} else {
				move(a, X, Y, K, h_x, h_y - 1, 2, turn++);
			}

			if (last_dir == 3) {
				move(a, X, Y, K, h_x, h_y + 1, 3, turn);
			} else {
				move(a, X, Y, K, h_x, h_y + 1, 3, turn++);
			}

		}
		return;
	}
}
