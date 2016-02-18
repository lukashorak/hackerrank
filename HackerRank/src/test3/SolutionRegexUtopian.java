package test3;

import java.util.Scanner;

public class SolutionRegexUtopian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for (int t =0;t<T;t++){
			String s = sc.nextLine();
			
			if (s.matches("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}$")){
				System.out.println("VALID");
			}else{
				System.out.println("INVALID");
			}
		}
		
	}

}
