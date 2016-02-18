package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexPhonenumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		Pattern p = Pattern.compile("(\\d{1,3})[\\s-](\\d{1,3})[\\s-](\\d{4,6})");
		for (int t=0;t<T;t++){
			String s = sc.nextLine();
			Matcher m = p.matcher(s);
			
			if (m.find()){
				String p1 = m.group(1);
				String p2 = m.group(2);
				String p3 = m.group(3);
				System.out.println("CountryCode="+p1+",LocalAreaCode="+p2+",Number="+p3);
			}
		}
	}
}
