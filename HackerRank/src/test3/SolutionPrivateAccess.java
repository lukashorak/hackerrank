package test3;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;


public class SolutionPrivateAccess {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine().trim());
		Object o;
		
		  if(num<1||num>Math.pow(2,30))
		        throw new Exception();
		  SolutionPrivateAccess ob=new SolutionPrivateAccess();
		    Class<?> c = Class.forName("SolutionPrivateAccess$Private");
		    Constructor<?> constructor = c.getDeclaredConstructor(SolutionPrivateAccess.class);
		    constructor.setAccessible(true);
		    o = constructor.newInstance(ob);
		    Method m =c.getDeclaredMethod("powerof2",new Class[]{int.class}) ;
		    m.setAccessible(true);         
		    String ans=(String) m.invoke(o,num);
		    System.out.println(num+" is "+ans);
		
//		SolutionPrivateAccess.Private obj=new SolutionPrivateAccess().new Private();
//		o=new SolutionPrivateAccess().new Private();
//		System.out.println(num+" is "+obj.powerof2(num));

		System.out.println("An instance of class: "+o.getClass().getSimpleName()+" has been created");
	}//end of main
  	class Private
 	{
       private String powerof2(int num)
 	   {
           return ((num&num-1)==0)?"power of 2":"not a power of 2";
       }
  	}//end of Privtate
}//end of solution

