package test2;

import java.util.Scanner;

public class SolutionGemStones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		 sc.nextLine();
		int[][] A = new int[N][255];
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			char[] arr = s.toCharArray();

			for (char c : arr) {
				int v = ((int) c);
				A[i][v]++;
			}
		}

		int count = 0;
		for (int y = 0; y < 255; y++) {

			int min = A[0][y];
			for (int i = 1; i < N; i++) {
				min = Math.min(min, A[i][y]);
			}
			
			if (min >0){
				char c = (char) y;
				count++;
			}
		}
		System.out.println(""+count);
	}
}
