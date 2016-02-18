package test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Data {
	Integer position;
	Integer value;
	String text;
}

public class SolutionCountingSort4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Data> list = new ArrayList<>();

		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			Data d = new Data();
			d.position = i;
			d.value = sc.nextInt();
			d.text = sc.nextLine().trim();
			list.add(d);
		}

		Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				if (o1.value.equals(o2.value)) {
					return o1.position.compareTo(o2.position);
				}
				return o1.value.compareTo(o2.value);
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			Data d = list.get(i);
//			System.out.print(d.text+" ");
			if (d.position < N/2){
				sb.append("- ");
			}else{
				sb.append(d.text+" ");
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
