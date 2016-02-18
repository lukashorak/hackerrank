package testML;

import java.util.Scanner;

public class SolutionBotSafeprincess {

	static void displayPathtoPrincess(int n, String[] grid) {
		int Y = grid.length;
		int X = grid[0].length();

		char[][] G = new char[Y][X];
		for (int y = 0; y < Y; y++) {
			G[y] = grid[y].toCharArray();
		}

		int pX = 0;
		int pY = 0;
		int bX = 0;
		int bY = 0;
		for (int y = 0; y < Y; y++) {
			for (int x = 0; x < X; x++) {
				if (G[y][x] == 'p') {
					pX = x;
					pY = y;
				}
				if (G[y][x] == 'm') {
					bX = x;
					bY = y;
				}
			}
		}

		for (int y = 0; y < Math.abs(pY - bY); y++) {
			if (pY > bY){
				System.out.println("DOWN");
				return;
			}else{
				System.out.println("UP");
				return;
			}
		}
		
		for (int x = 0; x < Math.abs(pX - bX); x++) {
			if (pX > bX){
				System.out.println("RIGHT");
				return;
			}else{
				System.out.println("LEFT");
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}