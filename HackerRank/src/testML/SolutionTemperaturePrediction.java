package testML;

import java.util.Scanner;

public class SolutionTemperaturePrediction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		sc.nextLine();

		for (int i = 0; i < N; i++) {

			String line = sc.nextLine();

			String[] parts = line.split("\\s+");

			if (parts[2].startsWith("Missing")) {

				Double down = Double.valueOf(parts[3]);
				
				System.out.printf("%.1f\n",(down+6.6));
			}
			if (parts[3].startsWith("Missing")) {
				Double up = Double.valueOf(parts[2]);
				System.out.printf("%.1f\n",(up-6.6));
			}
		}
	}

}
