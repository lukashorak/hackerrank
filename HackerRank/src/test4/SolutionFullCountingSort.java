package test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class DataIS {
	Integer position;
	Integer value;
	String text;
}

public class SolutionFullCountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<DataIS> list = new ArrayList<>();
		List<DataIS> listSorted = new ArrayList<>();

		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			DataIS d = new DataIS();
			d.position = i;
			d.value = sc.nextInt();
			d.text = sc.nextLine().trim();
			list.add(d);
		}

		Collections.sort(list, new Comparator<DataIS>() {
			@Override
			public int compare(DataIS o1, DataIS o2) {
				if (o1.value.equals(o2.value)) {
					return o1.position.compareTo(o2.position);
				}
				return o1.value.compareTo(o2.value);
			}
		});

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			DataIS d = list.get(i);
			// System.out.print(d.text+" ");
			if (d.position < N / 2) {
				sb.append("- ");
			} else {
				sb.append(d.text + " ");

			}
		}

		System.out.println(sb.toString());
	}
}