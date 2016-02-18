package test2;

import java.util.*;

public class SolutionDeque {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			arr[i] = num;
		}

//		for (int i = 0; i < m; i++) {
//			deque.add(arr[i]);
//
//			if (map.containsKey(arr[i])) {
//				Integer c = map.get(arr[i]);
//				c = c + 1;
//				map.put(arr[i], c);
//			} else {
//				map.put(arr[i], 1);
//			}
//		}

		int maxSize = map.size();
		for (int i = 0; i < n; i++) {
			deque.add(arr[i]);
			
			if (map.containsKey(arr[i])) {
				Integer c = map.get(arr[i]);
				c = c + 1;
				map.put(arr[i], c);
			} else {
				map.put(arr[i], 1);
			}
			
			if (i > m){
			Integer r = deque.poll();
			Integer c = map.get(r);
			c = c - 1;
			if (c == 0) {
				map.remove(r);
			} else {
				map.put(r, c);
			}
			}

			maxSize = Math.max(maxSize, map.size());
		}

		System.out.println(maxSize);

	}
}
