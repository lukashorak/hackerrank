package test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionSansaAndXOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();

			}
			run(n, arr);
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
				}
			}
			out.add(list);
		}

		return out;
	}

	static List<Integer[]> printContinuousSubArrays(int[] set, int n) {
		List<Integer[]> out = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i + j > n) {
					break;
				}
				int[] arr = Arrays.copyOfRange(set, i, i + j);

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

	// This problem has got a very simple solution,if the length of the array is
	// even,simply print 0 If length is odd,then you have to take XOR of only
	// the elements which are present at odd positions,that is elements present
	// at index 0,2,4,....,(2n).

	public static void run(int n, int[] arr) {

		if (n%2==0){
			System.out.println(0);
			return;
		}
		
		
		Integer xor = 0;

		for (int i=0;i<n;i=i+2){
			xor ^= arr[i];
		}
		
		System.out.println(xor);
	}

	
	public static void run3(int n, int[] arr) {
		List<Integer[]> all = printContinuousSubArrays(arr, n);

		Integer xor = 0;

		for (Integer[] list : all) {
			Integer in = 0;
			for (Integer i : list) {
				in ^= i;
			}

			xor ^= in;

		}

		System.out.println(xor);
	}

	public static void run2(int n, int[] arr) {
		List<List<Integer>> all = printPowerSetGeneric(arr, n);

		Integer xor = 0;

		for (List<Integer> list : all) {
			Integer in = 0;
			for (Integer i : list) {
				in ^= i;
			}

			xor ^= in;

		}

		System.out.println(xor);
	}

}
