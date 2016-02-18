package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		TreeSet<String> emails = new TreeSet<>();
		Pattern word = Pattern.compile("\\b[a-zA-Z0-9_\\.]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*\\b");
		for (int t =0;t<T;t++){
			String s = sc.nextLine();
			
			Matcher m = word.matcher(s);
			while (m.find()){
				emails.add(m.group());
//				System.out.println(s);
				
			}
		}
		List<String> list = new ArrayList<>(emails);
		Collections.sort(list);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()){
			System.out.print(it.next());
			if (it.hasNext()){
				System.out.print(";");
			}
		}
	}
}
