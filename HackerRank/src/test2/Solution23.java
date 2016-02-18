package test2;

import java.util.Scanner;
import java.util.Stack;

public class Solution23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();
		Stack<Integer> maxStack = new Stack<>();
		int S = sc.nextInt();
		for (int i = 0; i < S; i++) {

			int action = sc.nextInt();
			
			if (action == 1){
				int v = sc.nextInt();
				stack.push(v);
				
				if (maxStack.empty()){
					maxStack.push(v);
				}else if (v >= maxStack.peek()){
					maxStack.push(v);
				}
				
			} else if (action == 2){
				
				
				int v = stack.pop();
				if (v == maxStack.peek()){
					maxStack.pop();
				}
			} else if (action ==3 ){
				
				int max = maxStack.peek();
				
				System.out.println(max);
			}
			
		}
	}
}
