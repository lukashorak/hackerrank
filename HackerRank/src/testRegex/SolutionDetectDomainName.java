package testRegex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionDetectDomainName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pattern pUrl = Pattern.compile("(?i)https?://(www.)?([^/\\\"'_?&\\s\\\\]+)");

		int N = sc.nextInt();
		sc.nextLine();

		SortedSet<String> domains = new TreeSet<>();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			Matcher m = pUrl.matcher(s);

			while (m.find()) {
				String domain = m.group(2);
				if (domain.contains(".")) {
					domains.add(domain);
				}
			}

		}

		Iterator<String> it = domains.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext()) {
				System.out.print(";");
			}
		}
	}
}
