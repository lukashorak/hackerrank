package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCaesar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			int ascii = (int) arr[i];

			if (ascii >= 97 && ascii <= 122) {
				ascii += k;
				ascii = ((ascii - 97) % 26) + 97;

				char print = (char) ascii;
				System.out.print(print);
			} else if (ascii >= 65 && ascii <= 90) {
				ascii += k;
				ascii = ((ascii - 65) % 26) + 65;

				char print = (char) ascii;
				System.out.print(print);
			} else {

				System.out.print(arr[i]);
			}
		}
	}
}
