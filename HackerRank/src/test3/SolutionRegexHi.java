package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexHi {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		Pattern word = Pattern.compile("^([hH][iI]\\s[^dD])");
		for (int t =0;t<T;t++){
			String s = sc.nextLine();
			
			Matcher m = word.matcher(s);
			if (m.find()){
				System.out.println(s);
			}
		}
		
	}
}
