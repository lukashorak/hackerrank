package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexEnglish1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		List<String> text = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			String s = sc.nextLine();
			text.add(s);
		}

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {
			String w = sc.nextLine();
			Pattern word = Pattern.compile("([a-z]+)[sz]e");
			Matcher wordMatcher = word.matcher(w);

			if (wordMatcher.find()) {
				String part = wordMatcher.group(1);

				Pattern p = Pattern.compile("\\b" + part + "[sz]e\\b");

				int count = 0;
				for (String s : text) {
					Matcher m = p.matcher(s);
					while (m.find()) {
						count++;
					}
				}
				System.out.println(count);
			} else {
				System.out.println(0);
			}
		}
	}
}
