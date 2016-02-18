package test2;

import java.util.*;

public class SolutionDynamicArray {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        List<List<Integer>> seq = new ArrayList<>();
        for (int n = 0;n<N;n++){
        	List<Integer> s = new ArrayList<>();
        	seq.add(s);
        }
        
        int lastans = 0;
        
        for (int q = 0;q<Q;q++){
         
        	int t = sc.nextInt();
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	int pos = (x^lastans) % N;
        	if (t == 1){
        		seq.get(pos).add(y);
        		
        	}else if (t == 2){
        		int print = y % seq.get(pos).size();
        		
        		lastans = seq.get(pos).get(print);
        		
        		System.out.println(lastans);
        	}
        	
        }
        
    }
}
