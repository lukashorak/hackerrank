package test2;

import java.util.*;

public class SolutionAlternatingCharacters {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int t=0;t<T;t++){
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            
            LinkedList<Character> list = new LinkedList<>();
            for (Character c:arr){
            	list.add(c);
            }
            
            int counter = 0;
            Iterator<Character> it = list.iterator();
            Character prev = it.next();
            while(it.hasNext()){
            	Character curr = it.next();
            	if (prev.equals(curr)){
            		it.remove();
            		counter++;
            	}else{
            		prev = curr;
            	}
            }
            
            System.out.println(counter);
        }
    }
}
