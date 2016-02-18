package test;

import java.util.*;

public class SolutionGridSearch {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			
			run();
		}
	}
	
	public static void run(){
		int R = in.nextInt();
		int C = in.nextInt();
		int[][] M = new int[R][C];
		
		
//		String G[] = new String[R];
		for (int G_i = 0; G_i < R; G_i++) {
			String s = in.next();

			for (int x =0;x<s.length();x++){
				M[G_i][x] = Integer.valueOf(""+s.charAt(x));
			}
		}
		
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] P = new int[r][c];
		for (int P_i = 0; P_i < r; P_i++) {
			String s = in.next();
			for (int x =0;x<s.length();x++){
				P[P_i][x] = Integer.valueOf(""+s.charAt(x));
			}
		}
		boolean match = false;
		
		int y = 0;
		int x = 0;
		
		for (int y_i = 0;y_i<=(R-r);y_i++){
			for (int x_i = 0;x_i<=(C-c);x_i++){
				
				match = compare(M, P, R, C, r, c, y_i, x_i);
				
				if (match){
					System.out.println("YES");
					return;
				}
				
			}
		}
		
		if (match){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	
	public static boolean compare(int[][] M, int[][] P, int R, int C, int r, int c, int y_i, int x_i ){
		for (int y_m = 0;y_m<r;y_m++){
			for (int x_m = 0;x_m<c;x_m++){
				if (P[y_m][x_m] != M[y_i+y_m][x_i+x_m]){
					return false;
				}
			}
		}
		
		return true;
	}
}
