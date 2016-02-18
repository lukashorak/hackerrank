package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionMatrixRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();

		int[][] Mat1 = new int[N][M];

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				Mat1[y][x] = sc.nextInt();
			}
		}

		int maxLevel = Math.min(M / 2, N / 2);
		
		for (int level = 0;level<maxLevel;level++){
			Mat1 = rotateLevel(Mat1, N, M, R, level);
//			print(Mat1, N, M);
		}
		print(Mat1, N, M);
//		int level = 1;
//		int circle = M + N + M + N;
//		int[][] Mat2 = rotateLevel(Mat1, N, M, R, 0);
//		int[][] Mat3 = rotateLevel(Mat2, N, M, R, 1);

		// print(Mat2, N, M);
//		print(Mat3, N, M);
		// for (int y = 0;y<N;y++){
		// System.out.println(Arrays.toString(Mat2[y]));
		// }
		//
	}

	public static int[][] rotateLevel(int[][] Mat1, int N, int M, int R,
			int level) {
		int[][] Mat2 = new int[N][M];
		for (int y = 0; y < N; y++) {
			Mat2[y] = Arrays.copyOf(Mat1[y], Mat1[y].length);
		}

		N = N - level;
		M = M - level;

		List<Integer> line = new ArrayList<>();
		for (int c = level; c < M; c++) {
			line.add(Mat1[level][c]);
		}
		for (int c = 1 + level; c < N; c++) {
			line.add(Mat1[c][M - 1]);
		}
		for (int c = M - 2; c > level ; c--) {
			line.add(Mat1[N - 1][c]);
		}
		for (int c = N - 1; c > level; c--) {
			line.add(Mat1[c][level]);
		}

		 System.out.println(Arrays.toString(line.toArray()));
		for (int i = 0; i < R; i++) {
			line.add(line.get(0));
			line.remove(0);
		}

		 System.out.println(Arrays.toString(line.toArray()));

		int pos = 0;
		for (int c = level; c < M; c++) {
			Mat2[level][c] = line.get(pos);
			pos++;
		}
		for (int c = 1 + level; c < N; c++) {
			Mat2[c][M - 1] = line.get(pos);
			pos++;
		}
		for (int c = M - 2; c > level; c--) {
			Mat2[N - 1][c] = line.get(pos);
			pos++;
		}
		for (int c = N - 1; c > level; c--) {
			Mat2[c][level] = line.get(pos);
			pos++;
		}

		return Mat2;
	}

	public static int[][] rotateLevel0(int[][] Mat1, int N, int M, int R,
			int level) {
		int[][] Mat2 = new int[N][M];
		for (int y = 0; y < N; y++) {
			Mat2[y] = Arrays.copyOf(Mat1[y], Mat1[y].length);
		}

		List<Integer> line = new ArrayList<>();
		for (int c = 0; c < M; c++) {
			line.add(Mat1[0][c]);
		}
		for (int c = 1; c < N; c++) {
			line.add(Mat1[c][M - 1]);
		}
		for (int c = 1; c < M; c++) {
			line.add(Mat1[N - 1][M - c - 1]);
		}
		for (int c = 1; c < N - 1; c++) {
			line.add(Mat1[N - c - 1][0]);
		}

		// System.out.println(Arrays.toString(line.toArray()));
		for (int i = 0; i < (R % line.size()); i++) {
			line.add(line.get(0));
			line.remove(0);
		}
		// System.out.println(Arrays.toString(line.toArray()));

		int pos = 0;
		for (int c = 0; c < M; c++) {
			Mat2[0][c] = line.get(pos);
			pos++;
		}
		for (int c = 1; c < N; c++) {
			Mat2[c][M - 1] = line.get(pos);
			pos++;
		}
		for (int c = 1; c < M; c++) {
			Mat2[N - 1][M - c - 1] = line.get(pos);
			pos++;
		}
		for (int c = 1; c < N - 1; c++) {
			Mat2[N - c - 1][0] = line.get(pos);
			pos++;
		}

		return Mat2;
	}

	public static void print(int[][] Mat, int N, int M) {
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				System.out.print(Mat[y][x] + " ");
			}
			System.out.println();
		}
	}
}
