package test2;

import java.util.*;

public class SolutionMissingNumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		int[] arr = new int[1000011];
		
		for (int i =0;i<M;i++){
			int v = sc.nextInt();
			arr[v]--;
		}
		
		int N = sc.nextInt();
		
		for (int i =0;i<N;i++){
			int v = sc.nextInt();
			arr[v]++;
		}
		
		for (int i =0;i<1000011;i++){
			if (arr[i] > 0){
				System.out.print(i+" ");
			}
			
		}
	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		List<Integer> listA = new ArrayList<>();
		
		for (int i =0;i<M;i++){
			listA.add(sc.nextInt());
		}
		
		int N = sc.nextInt();
		List<Integer> listB = new ArrayList<>();
		
		for (int i =0;i<N;i++){
			listB.add(sc.nextInt());
		}
		
		for (int i =0;i<M;i++){
			Integer x = listA.get(i);
			
			listB.remove(x);
		}
		
//		Collections.sort(listB);
		Set<Integer> setOut = new TreeSet<>(listB);
		for (Integer x :setOut){
			System.out.print(x+" ");
		}
	}
}
