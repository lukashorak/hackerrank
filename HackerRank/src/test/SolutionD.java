package test;

import java.util.*;
class SolutionD{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
          
         Stack<Character> stack = new Stack<>();
          
         char[] arr = input.toCharArray();
         
         boolean correct = true;
         for (char c:arr){
        	 
        	 if (c == '[' || c == '(' || c == '{'){
        		stack.push(c); 
        	 }else if (c == ']' || c == ')' || c == '}'){
        		 if (stack.size()==0){
        			 correct=false;
        			 break;
        		 }
        		 char t = stack.pop();        		 
        		 if  ((c == ']' && t == '[' )||(c == '}' && t == '{' )||(c == ')' && t == '(' )){
        			 
        		 }else{
        			 correct = false;
        			 break;
        		 }
        	 }
        	 
         }
         
         if (correct && stack.size()==0){
        	 System.out.println("true");
         }else{
        	 System.out.println("false");	 
         }
         
            //Complete the code
      }
      
   }
}
