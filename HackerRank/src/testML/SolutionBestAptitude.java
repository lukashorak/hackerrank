package testML;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Student {
	Integer pos;
	Double gpa;

	Double[] apt = new Double[5];

	int gpaPos;
	int[] aptPos = new int[5];
}

class StudentComparator implements Comparator<Student> {
	public StudentComparator(int x) {
		this.x = x;
	}

	int x;

	@Override
	public int compare(Student o1, Student o2) {
		return o1.apt[x].compareTo(o2.apt[x]);
	}
}

public class SolutionBestAptitude {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();

			List<Student> sList = new ArrayList<>();
			Double[] gpa = new Double[N];
			Double[][] apt = new Double[N][5];
			long[] diff = new long[5];

			for (int n = 0; n < N; n++) {
				gpa[n] = sc.nextDouble();
			}

			for (int n = 0; n < N; n++) {
				Student s = new Student();
				s.gpa = gpa[n];
				for (int a = 0; a < 5; a++) {
					apt[n][a] = sc.nextDouble();

				}
				s.apt = apt[n];
				sList.add(s);
			}

			Collections.sort(sList, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o1.gpa.compareTo(o2.gpa);
				}
			});

			for (int n = 0; n < N; n++) {
				sList.get(n).gpaPos = n;
			}

			for (int x = 0; x < 5; x++) {
				Collections.sort(sList, new StudentComparator(x));

				for (int n = 0; n < N; n++) {
					Student s = sList.get(n);
					s.aptPos[0] = n;
					
					diff[x] += Math.abs(s.gpaPos - s.aptPos[x]);
				}
			}

			for (int x = 0; x < 5; x++) {
				System.out.println(diff[x]);
			}
		}
	}
}
