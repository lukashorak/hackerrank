package test2;

import java.util.Scanner;

public class SolutionServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int width[] = new int[N];
		for (int width_i = 0; width_i < N; width_i++) {
			width[width_i] = in.nextInt();
		}
		for (int t = 0; t < T; t++) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			int min = 3;
			
			for (int x = i;x<=j;x++){
				min = Math.min(min, width[x]);
			}
			
			System.out.println(min);
		}
	}
}
