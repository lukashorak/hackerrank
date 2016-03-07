package testRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionDetectHtmlLinks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern.compile("(?i)<a([^>]+)>(.*?)</a>");
		Pattern pHref = Pattern.compile("href=\"([^\"]+)\"");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			Matcher m = p.matcher(s);

			while (m.find()) {
				String linkData = m.group(1);
				String title = m.group(2);
				String link = null;
				Matcher mHref = pHref.matcher(linkData);
				if (mHref.find()){
					link = mHref.group(1);
				}
				
				
				if (title == null) {
					title = "";
				} else {
					title = title.replaceAll("(</?[^>]+>)", "");
				}
				System.out.println(link + "," + title.trim());
			}
		}
	}

}
