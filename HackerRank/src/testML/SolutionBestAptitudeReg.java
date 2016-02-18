package testML;

import java.util.Locale;
import java.util.Scanner;

public class SolutionBestAptitudeReg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();

			double[] gpa = new double[N];

			double[][] apt = new double[N][5];
			
			for (int n = 0;n<N;n++){
				gpa[n] = sc.nextDouble() / 10.0;
			}

			for (int n = 0;n<N;n++){
				
				for (int a= 0;a<5;a++){
					apt[n][a] = sc.nextDouble();
				}
			}
			
			double[] corr = new double[5];
			
			int maxPos = 0;
			double maxValue = -1;
			for (int a= 0;a<5;a++){
			
				double[] aptX = new double[N];
				
				for (int i = 0;i<N;i++){
					aptX[i] = apt[i][a] / 100.0;
				}
				
				corr[a] = correlation(gpa, aptX);
				
				if (corr[a] > maxValue){
					maxPos = a;
					maxValue = corr[a];
				}
				System.out.println(corr[a]);
			}
			
			System.out.println(maxPos+1);
		}
	}

	public static double correlation(double[] xs, double[] ys) {
		double sx = 0.0;
		double sy = 0.0;
		double sxx = 0.0;
		double syy = 0.0;
		double sxy = 0.0;

		int n = xs.length;

		for (int i = 0; i < n; ++i) {
			double x = xs[i];
			double y = ys[i];

			sx += x;
			sy += y;
			sxx += x * x;
			syy += y * y;
			sxy += x * y;
		}

		// covariation
		double cov = sxy / n - sx * sy / n / n;
		// standard error of x
		double sigmax = Math.sqrt(sxx / n - sx * sx / n / n);
		// standard error of y
		double sigmay = Math.sqrt(syy / n - sy * sy / n / n);

		// correlation is just a normalized covariation
		return cov / sigmax / sigmay;
	}
}
