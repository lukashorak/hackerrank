package test4;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionMaxMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Integer[] arr = new Integer[N];
		
		for (int i =0;i<N;i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		Integer diff = null;
		
		for (int i=0;i<=(N-K);i++){
			int low = arr[i];
			int high = arr[i+(K-1)];
			
			int diffGroup = high - low;
			
			if (diff == null){
				diff = diffGroup;
			}
			
			if (diffGroup < diff){
				diff = diffGroup;
			}
		}
		
		System.out.println(diff);
	}

}
