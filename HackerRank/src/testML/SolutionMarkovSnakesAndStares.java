package testML;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SolutionMarkovSnakesAndStares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			double[] dice = new double[6];
			String diceString = sc.nextLine();
			for (int d = 0; d < 6; d++) {
				dice[d] = Double.valueOf(diceString.split(",")[d]);
			}

			String ladderSnake = sc.nextLine();
			int L = Integer.valueOf(ladderSnake.split(",")[0]);
			int S = Integer.valueOf(ladderSnake.split(",")[1]);

			HashMap<Integer, Integer> map = new HashMap<>();

			String ladderLine = sc.nextLine();
			for (int l = 0; l < L; l++) {
				String ladder = ladderLine.split("\\s")[l];
				map.put(Integer.valueOf(ladder.split(",")[0]),
						Integer.valueOf(ladder.split(",")[1]));
			}

			String snakeLine = sc.nextLine();
			for (int s = 0; s < S; s++) {
				String snake = snakeLine.split("\\s")[s];
				map.put(Integer.valueOf(snake.split(",")[0]),
						Integer.valueOf(snake.split(",")[1]));
			}

			int sumSteps = 0;

			for (int g = 0; g < 5000; g++) {
				sumSteps += run(dice, map);
			}
			System.out.println(Math.round((double) sumSteps / (double) 5000.0));
		}
	}

	public static int run(double[] dice, HashMap<Integer, Integer> map) {

		int pos = 1;
		int steps = 0;
		while (pos != 100 && steps < 1000) {
			steps++;

			int move = throwDice(dice);

			if (move + pos <= 100) {
				pos += move;
			}
			if (map.containsKey(pos)) {
				pos = map.get(pos);
			}

		}

		return steps;
	}

	public static int throwDice(double[] dice) {
		Random r = new Random();
		double v = r.nextDouble();

		int pos = 0;
		double sum = 0;
		while (sum < v) {
			sum += dice[pos];
			pos++;

		}

		return pos;
	}
}
