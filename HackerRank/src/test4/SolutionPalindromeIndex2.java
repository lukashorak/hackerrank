package test4;

import java.util.Scanner;

public class SolutionPalindromeIndex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			run(sc.nextLine());
		}
	}

	public static void run(String s) {

		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < s.length() / 2; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(s.length() - 1 - i);

			if (c1 == c2) {
				a.append(c1);
				b.append(c2);
			} else {
				// System.out.println(i + " "+(s.length()-1-i));

				if (checkPalindrom(s.substring(0, i)
						+ s.substring(i + 1, s.length()))) {
					System.out.println(i);
				} else {
					System.out.println((s.length() - 1 - i));
					
				}
				return;
			}

		}
		System.out.println(-1);
	}

	public static boolean checkPalindrom(String s) {
		boolean match = true;
		for (int x = 0; x < s.length() / 2; x++) {
			if (s.charAt(x) != s.charAt(s.length() - 1 - x)) {
				match = false;
				break;
			}
		}

		return match;
	}
}
