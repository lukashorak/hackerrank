package test4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SolutionBfsShortestReach {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 0;t<T;t++){
			Integer N = sc.nextInt();
			Integer E = sc.nextInt();
			
			Integer[][] c = new Integer[N][N];
			
			for (int e = 0;e<E;e++){
				Integer nStart = sc.nextInt();
				Integer nEnd = sc.nextInt();
				
				c[nStart][nEnd] = 6;
				c[nEnd][nStart] = 6;
			}
			
			Integer S = sc.nextInt();
			
			Deque<Integer> dq = new LinkedList<>();
			dq.add(S);
			
			
		}
		
	}
}
