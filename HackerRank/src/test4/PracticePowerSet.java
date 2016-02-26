package test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticePowerSet {

	static void printPowerSet(char[] set, int set_size) {
		/*
		 * set_size of power set of a set with set_size n is (2**n -1)
		 */
		int pow_set_size = (int) Math.pow(2, set_size);
		int counter, j;

		/* Run from counter 000..0 to 111..1 */
		for (counter = 0; counter < pow_set_size; counter++) {
			for (j = 0; j < set_size; j++) {
				/*
				 * Check if jth bit in the counter is set If set then pront jth
				 * element from set
				 */
				if (((counter & (1 << j)) == 0)) {
					System.out.printf("%c", set[j]);
				}
			}
			System.out.printf("\n");
		}
	}

	static List<List<Integer>> printPowerSetGeneric(int[] set, int set_size) {
		List<List<Integer>> out = new ArrayList<>();
		int pow_set_size = (int) Math.pow(2, set_size);
		int counter, j;

		for (counter = 0; counter < pow_set_size; counter++) {
			List<Integer> list = new ArrayList<>();
			for (j = 0; j < set_size; j++) {
				if (((counter & (1 << j)) == 0)) {
					list.add(set[j]);
					System.out.printf("%d", set[j]);
				}
			}
			out.add(list);
			System.out.printf("\n");
		}

		return out;
	}

	static List<Integer[]> printContinuousSubArrays(int[] set, int n) {
		List<Integer[]> out = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i+j > n){
					break;
				}
				int[] arr = Arrays.copyOfRange(set, i, i+j);

				Integer[] arr2 = new Integer[arr.length];
				for (int x = 0; x < arr.length; x++) {
					arr2[x] = arr[x];
				}

				out.add(arr2);
				
				System.out.println(Arrays.toString(arr2));
			}
		}

		return out;
	}

	public static void main(String[] args) {
		// char set[] = { 'a', 'b', 'c' };
		// printPowerSet(set, 3);
		int set2[] = { 3, 5, 7 };
		// printPowerSetGeneric(set2, 3);

		printContinuousSubArrays(set2, 3);

	}

}
