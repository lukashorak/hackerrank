package test3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SolutionDay28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for (int t = 0; t < testCases; t++) {
			String patternString = in.nextLine();

			try {
				Pattern replace = Pattern.compile(patternString);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}

		}
	}
}
