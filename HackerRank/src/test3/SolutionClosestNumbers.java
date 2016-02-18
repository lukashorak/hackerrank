package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionClosestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Long> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			Long v = sc.nextLong();
			list.add(v);
		}

		Collections.sort(list);

		long minA = list.get(0);
		long minB = list.get(1);
		long diff = minB - minA;

		for (int i = 1; i < N; i++) {
			long a = list.get(i - 1);
			long b = list.get(i);

			if (diff > b-a){
				diff = Math.min(diff, b - a);
				minA = a;
				minB = b;
			}
			
		}

		System.out.println(minA +" "+minB);
	}
}
