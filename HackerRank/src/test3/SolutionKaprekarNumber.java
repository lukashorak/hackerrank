package test3;

import java.util.Scanner;

public class SolutionKaprekarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;
		for (int n = a; n <= b; n++) {

			long v = (long) Math.pow(n, 2);

			String s = "" + v;

			String s1 = s.substring(0, s.length() / 2);
			String s2 = s
					.substring(s.length() / 2 , s.length());

			Long i1 = Long.valueOf("0"+s1);
			Long i2 = Long.valueOf("0"+s2);

			long sum = i1 + i2;

			if (n == sum) {
				count++;
				System.out.print(n + " ");
			}
		}

		if (count==0){
			System.out.println("INVALID RANGE");	
		}
		
	}
}
