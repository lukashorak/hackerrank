package test2;

import java.util.Scanner;

public class SolutionLoveLetter {
	
	

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t= 0;t<T;t++){
			String s = sc.nextLine();
			
			
			int x = s.length() / 2;
			int y = s.length() / 2 + s.length() % 2;
			
			String a = s.substring(0,x);
			String b = s.substring(y,s.length());
			
			int diffSum = 0;
			
			for (int i =0;i<x;i++){
				
				int c1 =  a.charAt(i);
				int c2 =  b.charAt(x-1-i);
				
				int diff = Math.abs(c1-c2);
				
				diffSum += diff;
			}
			
//			System.out.println(x + " "+ y);
//			System.out.println(a + " "+ b);
			System.out.println(diffSum);
					
		}
	}
}
