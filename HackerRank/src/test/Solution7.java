package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int n = ar.length;
		if (n > 1) {
			int e = ar[n - 1];
			int pos = n - 2;

			while (pos>= 0 && ar[pos] > e ) {
				ar[pos + 1] = ar[pos];
				pos--;
				printArray(ar);
			}
			ar[pos + 1] = e;			
		}
		printArray(ar);
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
