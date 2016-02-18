package test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SolutionGridChallenge {

	static class Column{
		public char[] arr;
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			sc.nextLine();
			
			char[][] A = new char[N][N];

			Column[] C = new Column[N];
			for (int i = 0;i<N;i++){
				C[i] = new Column();
				C[i].arr = new char[N];
			}
			
			for (int i = 0;i<N;i++){
				A[i] = sc.nextLine().toCharArray();
				for (int x = 0;x<N;x++){
					C[x].arr[i] = A[i][x];
				}
			}
			
			Arrays.sort(C, new Comparator<Column>(){

				@Override
				public int compare(Column arg0, Column arg1) {
					return arg0.arr[0] - arg1.arr[0];
				}
				
			});
			
			
			System.out.println(C[0].arr);
		}
	}
}
