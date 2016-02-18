package test;

import java.util.HashSet;
import java.util.Scanner;

class Solution5 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Integer[][] grid = new Integer[9][9];
		for (int i = 0; i < 9; i++) {
			String row = in.nextLine();
			String[] r = row.split("\\s");
			for (int x = 0; x < 9; x++) {
				grid[i][x] = Integer.valueOf(r[x]);
			}
		}

		for (int l = 0; l < 9; l++) {
			HashSet<Integer> rSet = new HashSet<Integer>();
			HashSet<Integer> cSet = new HashSet<Integer>();
			for (int x = 0; x < 9; x++) {
				rSet.add(grid[l][x]);
				cSet.add(grid[x][l]);
			}

			if (rSet.size() != 9) {
				System.out.println("false");
				return;
			}
			if (cSet.size() != 9) {
				System.out.println("false");
				return;
			}
		}

		for (int gx = 0; gx < 3; gx++) {
			for (int gy = 0; gy < 3; gy++) {

				HashSet<Integer> gSet = new HashSet<Integer>();
				int px, py;
				px = gx * 3 + 0;
				py = gy * 3 + 0;
				gSet.add(grid[py][px]);

				px = gx * 3 + 0;
				py = gy * 3 + 1;
				gSet.add(grid[py][px]);

				px = gx * 3 + 0;
				py = gy * 3 + 2;
				gSet.add(grid[py][px]);

				px = gx * 3 + 1;
				py = gy * 3 + 0;
				gSet.add(grid[py][px]);

				px = gx * 3 + 1;
				py = gy * 3 + 1;
				gSet.add(grid[py][px]);

				px = gx * 3 + 1;
				py = gy * 3 + 2;
				gSet.add(grid[py][px]);
				
				px = gx * 3 + 2;
				py = gy * 3 + 0;
				gSet.add(grid[py][px]);

				px = gx * 3 + 2;
				py = gy * 3 + 1;
				gSet.add(grid[py][px]);

				px = gx * 3 + 2;
				py = gy * 3 + 2;
				gSet.add(grid[py][px]);
				
				if (gSet.size() != 9) {
					System.out.println("false");
					return;
				}
			}
		}

		System.out.println("true");
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

	}
}