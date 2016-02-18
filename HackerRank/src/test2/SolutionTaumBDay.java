package test2;

import java.util.Scanner;

public class SolutionTaumBDay {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	long b = in.nextLong();
        	long w = in.nextLong();
        	long x = in.nextLong();
        	long y = in.nextLong();
            long z = in.nextLong();
            
            long bCost = b * Math.min(x, y+z);
            long wCost = w * Math.min(x+z, y);
            
            long cost = bCost + wCost;
            System.out.println(cost);
        }
    }
}
