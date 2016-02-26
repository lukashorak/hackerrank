package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionConnectedCellInGrid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] a = new int[M][N];
		
		for(int y =0;y<M;y++){
			for (int x =0;x<N;x++){
		
				a[y][x] = sc.nextInt();
			}
		}
		int max = 0;
		
		int g = 1;
		for(int y =0;y<M;y++){
			for (int x =0;x<N;x++){
				int v = check(a, M, N, y, x, g, 0);
				if (v > 0){
					g++;
				}
				max = Math.max(max, v);
//				System.out.println(y+","+x+"  " +g + " "+v);
			}
		}
		System.out.println(max);
	}
	
	public static int check(int[][] a,int M, int N ,int y, int x, int g, int p){
		
		if ((y >=0 && y <M) &&  (x >=0 && x <N)){
			if (a[y][x] == 1){
				p++;
				a[y][x] = -g;
				
				p = check(a, M, N, y-1, x-1, g, p);
				p = check(a, M, N, y-1, x, g, p);
				p = check(a, M, N, y-1, x+1, g, p);
				p = check(a, M, N, y, x-1, g, p);
				p = check(a, M, N, y, x+1, g, p);
				p = check(a, M, N, y+1, x-1, g, p);
				p = check(a, M, N, y+1, x, g, p);
				p = check(a, M, N, y+1, x+1, g, p);
			}
		}
		return p;
		
	}

}
