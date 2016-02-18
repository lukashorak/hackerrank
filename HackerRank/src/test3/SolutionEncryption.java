package test3;

import java.util.Scanner;

public class SolutionEncryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int rows = (int) Math.floor(Math.sqrt(s.length()));
		int columns = (int) Math.ceil(Math.sqrt(s.length()));
		if (rows * columns < s.length()){
			rows++;
		}

//		System.out.println(s.length() + " -> " + rows + " x " + columns);

		Character[][] G = new Character[rows][columns];
		for (int i = 0; i < s.length(); i++) {
			int y = i / columns;
			int x = i % columns;

//			System.out.println(y + " " + x + " : " + s.charAt(i));
			G[y][x] = s.charAt(i);
		}

		for (int y = 0; y < rows; y++) {
			for (int x = 0; x < columns; x++) {

//				System.out.print("" + G[y][x]);
			}
//			System.out.println(" ");
		}
//		System.out.println(" ");
		StringBuffer sb = new StringBuffer();
		for (int x = 0; x < columns; x++) {
			for (int y = 0; y < rows; y++) {

				
				if (G[y][x] != null) {
					System.out.print("" + G[y][x]);
					sb.append(G[y][x]);
				}
			}
			sb.append(" ");
			System.out.print(" ");
		}
//		System.out.println();
//		System.out.println(sb.toString());
//		System.out.println(sb.toString().replaceAll("(\\s)+", " "));
	}
}
