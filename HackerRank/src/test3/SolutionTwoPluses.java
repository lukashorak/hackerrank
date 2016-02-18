package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SolutionTwoPluses {

	static class Candidate {
		Integer x, y, size;
		
		@Override
		public String toString() {
			return x+" "+y+" "+size;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Y = sc.nextInt();
		int X = sc.nextInt();
		sc.nextLine();

		char[][] G = new char[Y][X];

		for (int y = 0; y < Y; y++) {
			G[y] = sc.nextLine().toCharArray();
		}

		List<Candidate> list = findCandidates(G);
		Collections.sort(list, new Comparator<Candidate>() {
			@Override
			public int compare(Candidate o1, Candidate o2) {
				return -o1.size.compareTo(o2.size);
			}
		});

		int maxProduct = 0;
		for (Candidate c : list) {

			char[][] GNew = apply(G, c.x, c.y, c.size);
			List<Candidate> secondList = findCandidates(GNew);

			Collections.sort(secondList, new Comparator<Candidate>() {
				@Override
				public int compare(Candidate o1, Candidate o2) {
					return -o1.size.compareTo(o2.size);
				}
			});

			if (secondList.size() > 0) {
				maxProduct = Math.max(maxProduct,
						(c.size * 4 + 1) * (secondList.get(0).size * 4 + 1));
			}

		}

		System.out.println(maxProduct);

	}

	public static List<Candidate> findCandidates(char[][] G) {

		int Y = G.length;
		int X = G[0].length;

		List<Candidate> list = new ArrayList<>();

		for (int y = 0; y < Y; y++) {
			for (int x = 0; x < X; x++) {

				for (int s = 0; s < Math.min(X, Y); s++) {
					if (x - s < 0 || y - s < 0 || x + s >= X || y + s >= Y) {
						break;
					}
					if (match(G, x, y, s)) {
						System.out.println(y + " " + x + " " + s);
						Candidate c = new Candidate();
						c.x = x;
						c.y = y;
						c.size = s;
						list.add(c);
					}
				}
			}
		}
		System.out.println();
		return list;
	}

	public static char[][] apply(char[][] G, int x, int y, int size) {
		char[][] GNew = deepCopy(G);

		for (int p = 0; p <= size; p++) {
			GNew[y + p][x] = 'B';
			GNew[y - p][x] = 'B';
			GNew[y][x + p] = 'B';
			GNew[y][x - p] = 'B';
		}
		return GNew;
	}

	static char[][] deepCopy(char[][] matrix) {
		return java.util.Arrays.stream(matrix).map(el -> el.clone())
				.toArray($ -> matrix.clone());
	}

	public static boolean match(char[][] G, int x, int y, int size) {

		for (int p = 0; p <= size; p++) {

			if (G[y + p][x] == 'B') {
				return false;
			}
			if (G[y - p][x] == 'B') {
				return false;
			}
			if (G[y][x + p] == 'B') {
				return false;
			}
			if (G[y][x - p] == 'B') {
				return false;
			}
		}

		return true;
	}
}
