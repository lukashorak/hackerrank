package test2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegexIp {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pattern ip4 = Pattern.compile("^([1-2][0-9]{2}|[1-9][0-9]|[0-9])\\.([1-2][0-9]{2}|[1-9][0-9]|[0-9])\\.([1-2][0-9]{2}|[1-9][0-9]|[0-9])\\.([1-2][0-9]{2}|[1-9][0-9]|[0-9])$");
		Pattern ip6 = Pattern.compile("^([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4}):([0-9a-f]{1,4})$");
		
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int t=0;t<T;t++){

			String s = sc.nextLine();
			Matcher matcherIp4 = ip4.matcher(s);
			Matcher matcherIp6 = ip6.matcher(s);
			if (matcherIp4.matches()){
				System.out.println("IPv4");
			}else if (matcherIp6.matches()){
				System.out.println("IPv6");
			}else{
				System.out.println("Neither");
			}
		}
		
		
		

	}

}
