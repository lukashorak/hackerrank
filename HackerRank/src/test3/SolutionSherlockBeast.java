package test3;
import java.util.Scanner;

public class SolutionSherlockBeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int y = in.nextInt();

			int z = y;

			while (z % 3 != 0) {
				z -= 5;
			}
			if (z < 0) {
				System.out.println("-1");
			} else {

				for (int i = 0; i < z; i++) {
					System.out.print("5");
				}
				for (int i = 0; i < (y - z); i++) {
					System.out.print("3");
				}
				System.out.println();
			}

		}

	}
}
