package test3;

import java.util.Scanner;

public class SolutionMakeAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int n = a.length();
		int[] A = new int[255];
		int[] B = new int[255];
		
		for (int i = 0;i<a.length();i++){
			A[a.charAt(i)]++;
		}
		for (int i = 0;i<b.length();i++){
			B[b.charAt(i)]++;
		}
		
		int diff = 0;
		for (int i = 0;i<255;i++){
			diff += Math.abs(A[i] - B[i]);
		}
		
		System.out.println(diff);
	}
}

