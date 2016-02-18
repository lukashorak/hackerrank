package test3;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {
			String a = sc.nextLine();
			System.out.println(testCase(a));
		}
	}

	public static int testCase(String s) {

		if (s.length() % 2 == 1) {
			return -1;
		}

		String a = s.substring(0, s.length() / 2);
		String b = s.substring(s.length() / 2, s.length());

		//System.out.println(a + " - " + b);

		int n = a.length();
		int[] A = new int[255];
		int[] B = new int[255];
		
		for (int i = 0;i<a.length();i++){
			A[a.charAt(i)]++;
		}
		for (int i = 0;i<b.length();i++){
			A[b.charAt(i)]--;
		}
		
		int diff = 0;
		for (int i = 0;i<255;i++){
			if (A[i]>0){
				diff += Math.max(A[i],0); 
			}
		}
		return diff;
	}
}
