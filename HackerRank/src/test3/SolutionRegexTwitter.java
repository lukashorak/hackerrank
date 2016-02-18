package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexTwitter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		TreeSet<String> emails = new TreeSet<>();
		Pattern word = Pattern.compile("(?i)hackerrank");

		int count = 0;
		for (int t = 0; t < T; t++) {
			String s = sc.nextLine();

			Matcher m = word.matcher(s);
			if (m.find()) {
				count++;
			}
		}

		System.out.println(count);
	}
}
