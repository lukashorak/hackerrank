package test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexDetectHtmlTags {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pattern pTags = Pattern
				.compile("<([a-zA-Z0-9]+)([^>]+)?>");
		Pattern pLink = Pattern.compile("\\[([^\\]]+)\\]\\(([^\\)]+)\\)");

		int N = sc.nextInt();
		sc.nextLine();

		SortedSet<String> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();

			Matcher mTags = pTags.matcher(s);

			while (mTags.find()) {
				set.add(mTags.group(1));
			}

			Matcher mLink = pLink.matcher(s);
			if (mLink.find()) {
				set.add("a");
			}
		}

		Iterator<String> it = set.iterator();
		while (it.hasNext()){
			String t = it.next();
			System.out.print(t);
			
			if (it.hasNext()){
				System.out.print(";");
			}
		}
	}
}
