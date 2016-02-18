package test2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexAlien {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pattern alien = Pattern.compile("^[\\._]\\d+[a-zA-Z]*_?$");

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {

			String s = sc.nextLine();
			Matcher matcherAlien = alien.matcher(s);
			if (matcherAlien.matches()) {
				System.out.println("VALID");
			} else {
				System.out.println("INVALID");
			}
		}

	}
}
