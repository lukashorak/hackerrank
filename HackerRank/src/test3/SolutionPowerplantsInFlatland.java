package test3;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionPowerplantsInFlatland {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c[] = new int[m];
		for (int c_i = 0; c_i < m; c_i++) {
			c[c_i] = in.nextInt();
		}

		Arrays.sort(c);

		int d[] = new int[n];

		for (int i = 0; i <= c[0]; i++) {
			d[i] = c[0] - i;
		}

		for (int i = c[0]; i < n; i++) {

			int p = Arrays.binarySearch(c, i);
			// System.out.println(p);
			if (p >= 0) {
				d[i] = 0;
			} else {

				int lastPos = c[Math.min(c.length - 1, -p - 2)];
				int nextPos = c[Math.min(c.length - 1, -p - 1)];

				d[i] = Math.min(Math.abs(i - lastPos), Math.abs(nextPos - i));
			}

		}

		// System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(d[d.length - 1]);
	}
}
