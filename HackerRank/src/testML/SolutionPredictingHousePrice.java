package testML;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPredictingHousePrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		Double last = 0.0;

		List<Double> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();

			String[] parts = line.split("\\s+");

			Double v = null;
			if (parts[2].startsWith("Missing")) {
				// System.out.printf("%.2f\n",last);
			} else {
				v = Double.valueOf(parts[2]);
			}
			list.add(v);
		}

		for (int i = 0; i < N; i++) {
			Double v = list.get(i);

			if (v == null) {

				Double sum = 0.0;
				int c = 0;
				int x = i;
				while (x >= 0) {

					if (list.get(x) != null) {
						sum += list.get(x);
						c++;
						break;
					}
					x--;
				}
				x = i;
				while (x < N) {
					if (list.get(x) != null) {
						sum += list.get(x);
						c++;
						break;
					}
					x++;
				}

				System.out.printf("%.2f\n", (sum / ((double) c)));
			}
		}
	}
}
