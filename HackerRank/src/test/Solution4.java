package test;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int C = in.nextInt();
		int N = in.nextInt();

		Deque<Integer> dequeLine = new ArrayDeque<Integer>();
		for (int i = 0; i < N; i++) {
			int pi = in.nextInt();
			dequeLine.add(pi);
		}

		long totalRide = 0;
		for (int c = 0; c < C; c++) {

			//System.err.print(c+">> ");	
			Deque<Integer> dequeRide = new ArrayDeque<Integer>();
			
			int cur = 0;
			while (cur <= L && dequeLine.size()>0){
				int group = dequeLine.peekFirst();
				
				if ((cur+group) <= L){
					//Add
					dequeRide.addLast(group);
					dequeLine.removeFirst();					
					cur+=group;	
					totalRide+=group;
					//System.err.print(group+",");
				}else{
					
					break;
				}
			}
			
			
			dequeLine.addAll(dequeRide);
			//System.err.println();
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(totalRide);
	}
}