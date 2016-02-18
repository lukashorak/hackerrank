package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionIntToArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			List<Integer> list = intToArray(n);
			System.out.println(list);
			
			int c = 0;
			
			for (Integer d :list){
				if (d.equals(0)){
					continue;
				}
				
				if (n % d ==0){
					c++;
				}
			}
			
			System.out.println(c);
			
		}
	}

	public static List<Integer> intToArray(int v) {

		List<Integer> list = new ArrayList<>();

		while (v != 0) {
			list.add(v % 10);
			v /= 10;
		}
		
		Collections.reverse(list);

		return list;
	}
}
