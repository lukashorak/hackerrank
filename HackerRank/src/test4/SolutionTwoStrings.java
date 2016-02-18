package test4;

import java.util.HashSet;
import java.util.Scanner;

public class SolutionTwoStrings {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {
			String a = sc.nextLine();
			String b = sc.nextLine();

			check(a, b);
		}
	}

	public static void check(String a, String b) {

		HashSet<Character> setB = new HashSet<>();

		for (char cB : b.toCharArray()) {
			setB.add(cB);
		}
		for (char cA : a.toCharArray()) {

			if (setB.contains(cA)) {
				System.out.println("YES");
				return;
			}
		}

		System.out.println("NO");
	}
}
