package test;

    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13Regex2 {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		// Complete the code
		//String s = "He is a very very good boy, isn't he?";
		String[] split = s.split("[\\[\\]\\\\\\s![,?.\\_'@+]]");

		List<String> list = new ArrayList<>();
		for (String p : split) {
			if (p.length() > 0) {
				list.add(p);
			}
		}
		System.out.println(list.size());
		for (String p : list) {

			System.out.println(p);
		}

	}
}
