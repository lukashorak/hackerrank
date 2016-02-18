package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SolutionJimAndOrders {

	static class Group {
		int id;
		int t;
		int d;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Group> list = new ArrayList<>();
		for (int n = 1; n <= N; n++) {
			Group g = new Group();
			g.id = n;
			g.t = sc.nextInt();
			g.d = sc.nextInt();
			list.add(g);
		}

		Collections.sort(list, new Comparator<Group>() {

			@Override
			public int compare(Group o1, Group o2) {
				Integer v1 = o1.t + o1.d;
				Integer v2 = o2.t + o2.d;
				return v1.compareTo(v2);
			}

		});

		for (Group g : list) {
			System.out.print(g.id+" ");
		}
	}

}
