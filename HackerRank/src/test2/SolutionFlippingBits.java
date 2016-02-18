package test2;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionFlippingBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			BigInteger bi = new BigInteger(sc.next());
			BigInteger biFlip = bi;
			for (int i = 0; i < 32; i++) {
				biFlip = biFlip.flipBit(i);
			}

			System.out.println(biFlip);
		}

	}
}
