package test3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {
	public static void checkPrime(Integer... values) {

		for (Integer v : values) {

			boolean isPrime = true;
			for (int i = 2; i < (v / 2); i++) {

				if (v % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(v + " ");
			}

		}

	}
}

public class SolutionCheckPrime {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			Random rand = new Random();
			int n = rand.nextInt();
			Prime ob = new Prime();

			Prime.checkPrime(9, 10, 32, 89, 66);
			Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
			Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
