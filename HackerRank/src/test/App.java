package test;

import java.util.StringTokenizer;

public class App {
	public static void main(String[] args) {

		String str = "[LOG]This is String \n\n\n, split\n by [LOG]StringTokenizer, created by mkyong";

		System.out.println("---- Split by [LOG] ',' ------");
		
		String token = "[LOG]";
		StringTokenizer st = new StringTokenizer(str, token);

		while (st.hasMoreElements()) {
			
			System.out.print(token);
			System.out.println(st.nextElement());
			
			System.out.println("=======");
		}
	}
}