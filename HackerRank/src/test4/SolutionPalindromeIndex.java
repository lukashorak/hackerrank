package test4;

import java.util.Scanner;

public class SolutionPalindromeIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			run(sc.nextLine());
		}
	}

	public static void run(String s) {
		
		boolean match = true;
		for (int x = 0;x<s.length()/2;x++){
			if (s.charAt(x) != s.charAt(s.length()-1-x)){
				match =false;
				break;
			}
		}
		
		if (match){
			System.out.println(-1);
			return;
		}

		for (int i = 0;i<s.length();i++){
			String a = s.substring(0, i);
			String b = s.substring(i+1, s.length());
			
			//System.out.println(a+" "+b);
			
			String p = a+b;
			
			match = true;
			for (int x = 0;x<p.length()/2;x++){
				if (p.charAt(x) != p.charAt(p.length()-1-x)){
					match =false;
					break;
				}
			}
			
			if (match){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	
	

}
