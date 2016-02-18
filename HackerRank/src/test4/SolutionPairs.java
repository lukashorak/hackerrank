package test4;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionPairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int count = 0;
		
		for (int i =0;i<N;i++){
			int v = a[i];
			int v_next = v + D;
			
			int p = Arrays.binarySearch(a, v_next);
			if (p>0){
				count++;
			}
		}

		System.out.println(count);
	}

}
