package testML;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionStatistics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 0;
		double[] data = new double[N];

		// first pass: read in data, compute sample mean
		double dataSum = 0.0;
		for (int i = 0; i < N; i++) {
			data[i] = (double) sc.nextInt();
			dataSum += data[i];
			num++;
		}
		double ave = dataSum / num;

		double median = median(data);
		double mode = mode(data);
		double variance1 = 0.0;
		for (int i = 0; i < num; i++) {
			variance1 += (data[i] - ave) * (data[i] - ave);
		}

		double variance = variance1 / (double) num;
		double standardDaviation = Math.sqrt(variance);
		double lower = ave - 1.96 * standardDaviation / Math.sqrt(num);
		double higher = ave + 1.96 * standardDaviation / Math.sqrt(num);

		// print results
		System.out.printf("%.1f\n", ave);
		System.out.printf("%.1f\n", median);
		System.out.printf("%d\n", (int) mode);
		System.out.printf("%.1f\n", standardDaviation);
		System.out.printf("%.1f %.1f\n", lower, higher);
	}

	public static double mean(double[] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		return sum / m.length;
	}

	public static double mode(double a[]) {
		Arrays.sort(a);
		double maxValue = 0;
		int maxCount = 0;

		for (int i = 0; i < a.length; ++i) {
			int count = 0;
			for (int j = 0; j < a.length; ++j) {
				if (a[j] == a[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = a[i];
			}
		}
		return maxValue;
	}

	public static double median(double[] m) {
		Arrays.sort(m);
		int middle = m.length / 2;
		if (m.length % 2 == 1) {
			return m[middle];
		} else {
			return (m[middle - 1] + m[middle]) / 2.0;
		}
	}
}
