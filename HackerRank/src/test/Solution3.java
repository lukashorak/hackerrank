package test;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution3 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			String cGXLine = in.nextLine();
			sb.append(cGXLine);
			sb.append("\n");
		}
		String type = null;
		
		Boolean isEscape = false;
		
		String VALUE_KEY = "";
		String PRIMITIVE_TYPE = "";
		
		for (int i=0;i<sb.length();i++){
			boolean openEsc = false;
			boolean closeEsc = false;
			
			Character c = sb.charAt(i);
			if (c == '\''){
				if (isEscape){
					closeEsc = true;	
				}else{
					openEsc = true;
					isEscape = true;
				}
								
			}
			if (Character.isWhitespace(c) && isEscape){
				//TODO add
			}else{
				continue;
			}
			if (closeEsc )
			
			
			if (openEsc){
				isEscape = true;
			}
			if (closeEsc){
				isEscape = false;
			}
			System.out.println(i+"\t'"+c+"'\t"+isEscape+"\t"+type);
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println("answer");
	}
}