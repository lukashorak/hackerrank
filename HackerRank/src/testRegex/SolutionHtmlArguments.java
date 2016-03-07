package testRegex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionHtmlArguments {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern.compile("(?i)<([\\w]+)\\s?([^>]*)>");
		Pattern pAttr = Pattern.compile("(\\w+)=([\"'])[^\"']*\\2");
		int N = sc.nextInt();
		sc.nextLine();

		HashMap<String, SortedSet<String>> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			Matcher m = p.matcher(s);

			while (m.find()) {
				String tag = m.group(1);
				String group = m.group(2);
				Matcher mAttr = pAttr.matcher(group);

				if (!map.containsKey(tag)) {
					map.put(tag, new TreeSet<>());
				}
				while (mAttr.find()) {
					String attr = mAttr.group(1);

					SortedSet<String> set = map.get(tag);
					set.add(attr);
				}
			}
		}

		List<String> tagList = new ArrayList<>(map.keySet());
		Collections.sort(tagList);

		for (String tag : tagList) {
			System.out.print(tag);
			System.out.print(":");
			Iterator<String> it = map.get(tag).iterator();
			while (it.hasNext()) {
				System.out.print(it.next());
				if (it.hasNext()) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}
