package test3;

import java.util.Scanner;

public class SolutionMarsSos {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
               
        int diff = 0;
        for (int i =0;i<S.length();i +=3){
        	
        	String sub = S.substring(i, i+3);
        	
        	if (sub.toCharArray()[0] != 'S'){
        		diff++;
        	}
        	if (sub.toCharArray()[1] != 'O'){
        		diff++;
        	}
        	if (sub.toCharArray()[2] != 'S'){
        		diff++;
        	}
        	
        }
        
        System.out.println(diff);
    }
}
