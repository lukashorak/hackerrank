package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionACMTeams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String topic[] = new String[n];

		int[][] tI = new int[n][m];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			String s = sc.nextLine();
			topic[topic_i] = s;
			for (int x = 0; x < m; x++) {
				tI[topic_i][x] = Integer.valueOf(s.substring(x, x + 1));
			}
		}

		List<Integer> team = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i >= j) {
					continue;
				}
				team.add(combination(tI[i], tI[j]));
			}
		}

		Collections.sort(team);

		int max = team.get(team.size() - 1);
		int count = 1;
		for (int i = team.size() - 2; i >= 0; i--) {
			if (team.get(i) == max) {
				count++;
			} else {
				break;
			}
		}

		// System.out.println(Arrays.toString(tI[0]));
		System.out.println(max);
		System.out.println(count);
	}

	public static int combination(int[] a, int[] b) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] + b[i] > 0) {
				count++;
			}
		}

		return count;
	}
}
