package test3;

import java.util.Scanner;

public class SolutionRegexHackerrank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {
			String s = sc.nextLine();

			if (s.startsWith("hackerrank") && s.endsWith("hackerrank")) {
				System.out.println(0);
			} else if (s.startsWith("hackerrank")) {
				System.out.println(1);
			} else if (s.endsWith("hackerrank")) {
				System.out.println(2);
			} else {
				System.out.println(-1);
			}
		}
	}
}
