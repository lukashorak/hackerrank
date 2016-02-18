package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8Graph1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			sc.nextLine();

			HashMap<Integer, Integer> edges = new HashMap<Integer, Integer>();
			HashSet<Integer> nodes = new HashSet<Integer>();

			for (int m = 0; m < M; m++) {
				Integer from = sc.nextInt();
				Integer to = sc.nextInt();
				nodes.add(from);
				nodes.add(to);
				edges.put(from, to);
				edges.put(to, from);
			}
			
			
		}

	}
}