package testAccel;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionShortenDistance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int e = 0;
		int w = 0;
		int s = 0;
		int n = 0;
		for (char c : str.toCharArray()) {
			if (c == 'N'){
				n++;
			}
			if (c == 'W'){
				w++;
			}
			if (c == 'S'){
				s++;
			}
			if (c == 'E'){
				e++;
			}
		}
		
		while (n > 0 && s >0){
			n--;
			s--;
		}
		while (w > 0 && e >0){
			w--;
			e--;
		}
		for (int i = 0;i<e;i++){
			System.out.print("E");
		}
		for (int i = 0;i<n;i++){
			System.out.print("N");
		}
		for (int i = 0;i<s;i++){
			System.out.print("S");
		}
		for (int i = 0;i<w;i++){
			System.out.print("W");
		}

	}

	public static void main2(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		while (s.contains("N") && s.contains("S")) {
			s = s.replaceFirst("N", "");
			s = s.replaceFirst("S", "");
		}
		while (s.contains("W") && s.contains("E")) {
			s = s.replaceFirst("W", "");
			s = s.replaceFirst("E", "");
		}

		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		String out = new String(arr);
		System.out.println(out);
	}

}
