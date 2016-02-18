package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexDetectHtmlLinks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern
				.compile("<a\\shref=\"([^\"]+)\"(\\s([^>]+\"))?>(([\\S\\s]+)</a>)?");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			Matcher m = p.matcher(s);

			while (m.find()) {
				String link = m.group(1);
				String title = m.group(5);
				if (title == null){
					title ="";
				}else{
					title = title.replaceAll("(</?[^>]+>)", "");
				}
				System.out.println(link + "," + title.trim());
			}
		}
	}
}
