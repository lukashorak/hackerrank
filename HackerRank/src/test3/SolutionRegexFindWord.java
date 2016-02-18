package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexFindWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		List<String> words = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			words.add(sc.nextLine());
		}

		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String w = sc.nextLine();

			Pattern p = Pattern.compile("\\b" + w + "\\b");
			int count = 0;
			for (String s : words) {
				Matcher m = p.matcher(s);
				
				while(m.find()){
					count++;
				}
			}
			System.out.println(count);

		}

	}
}
