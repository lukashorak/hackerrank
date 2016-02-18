package test2;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionMarkToys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int prices[] = new int[n];
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		int answer = 0;
		
		Arrays.sort(prices);
		
		
		for (int i = 0;i<n;i++){
			if (prices[i] < k){
				answer++;
				k -= prices[i];
			}
		}
		
		
		// Compute the final answer from n,k,prices
		System.out.println(answer);
	}
}
