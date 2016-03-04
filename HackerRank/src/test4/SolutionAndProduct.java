package test4;

import java.util.Scanner;

public class SolutionAndProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0;i<T;i++){
			long A = sc.nextLong();
			long B = sc.nextLong();
			
			long out = getAndProduct(A, B);
			System.out.println(out);
		}
	}

	private static long getAndProduct(long a, long b) {
		
		long v = a;
		for (long i = a;i<=b;i++){
			v &= i;
		}
		return v;
	}
}
