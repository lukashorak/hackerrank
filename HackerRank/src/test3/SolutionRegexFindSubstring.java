package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexFindSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String[] lines = new String[N];
		for (int n = 0; n < N; n++) {
			lines[n] = sc.nextLine();
		}

		int T = sc.nextInt();
		sc.nextLine();

		String[] words = new String[T];
		for (int t = 0; t < T; t++) {
			words[t] = sc.nextLine();

			Pattern word = Pattern.compile("\\b([a-zA-Z0-9_]+)" + words[t]
					+ "([a-zA-Z0-9_]+)\\b");

			int count = 0;
			for (int n = 0; n < N; n++) {
				String s = lines[n];

				Matcher match = word.matcher(s);
				while (match.find()) {
					count++;
				}
			}

			System.out.println(count);
		}

	}
}
