package test3;

import java.util.Scanner;

public class SolutionGameOfThrones {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	       
	        char[] C = new char[255];
	        
	        for (char c:s.toCharArray()){
	        	C[c]++;
	        }
	        
	        if (s.length() %2 == 0){
	        	for (int i=0;i<255;i++){
	        		if (C[i] % 2 == 1){
	        			System.out.println("NO");
	        			return;
	        		}
	        	}
	        } else{
	        	int odd = 0;
	        	int even =0;
	        	for (int i=0;i<255;i++){
	        		if (C[i] % 2 == 0){
	        			even++;
	        		}else{
	        			odd++;
	        		}
	        	}
	        	if (odd > 1){
	        		System.out.println("NO");
        			return;
	        	}
	        }
	        
	        String ans = null;
	        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
	        System.out.println("YES");
	    }

}
