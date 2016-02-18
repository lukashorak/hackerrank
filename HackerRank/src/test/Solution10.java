package test;

import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String s = sc.nextLine();
			boolean funny = true;
			for (int i = 1; i < s.length(); i++) {
				int dif1 = Math.abs(s.toCharArray()[i] - s.toCharArray()[i-1]);
				int dif2 = Math.abs(s.toCharArray()[s.length()-i] - s.toCharArray()[s.length()-1-i]);
				if (dif1 != dif2){
					funny = false;
					break;
				}
			}
			if (funny) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}
}