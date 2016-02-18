package test3;

import java.util.Scanner;

public class SolutionRegexLatLon {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "\\([+-]?(90|[1-8][0-9]|[0-9])(\\.?|\\.\\d+),\\s[+-]?(180|1[0-7][0-9]|[1-9][0-9]|[0-9])(\\.?|\\.\\d+)\\)";
		
		int T = sc.nextInt();
		sc.nextLine();
		for (int t =0;t<T;t++){
			String s = sc.nextLine();
			
			if (s.matches(pattern)){
				System.out.println("Valid");
			}else{
				System.out.println("Invalid");
			}
		}
		
	}
	
}
