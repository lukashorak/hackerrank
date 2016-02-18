package test;

import java.lang.reflect.Method;
import java.util.*;


class Printer
{
 
    public <T> void printArray(T[] arr){
    	for (T t:arr){
    		System.out.println(t);
    	}
    }
}


public class Test {
	public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
		for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 
	
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }
        
        for (int i=0;i<m;i++){
            deque.add(arr[i]);
        }
        
        int maxSize = 0;
        for (int i=m;i<n;i++){
        	deque.add(arr[i]);
        	deque.poll();
        	
        	HashSet<Integer> set = new HashSet<>(deque);
        	maxSize = Math.max(maxSize, set.size());
        }
        
        System.out.println(maxSize);
        
    }
}
