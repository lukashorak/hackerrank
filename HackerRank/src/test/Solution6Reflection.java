package test;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class Solution6Reflection {

	public static void main(String[] args) throws Exception {
		Do_Not_Terminate.forbidExit();	

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

//			Inner.Private ip = (Inner.Private) o;
//			o = (Inner.Private) ip;
			
			o = new Solution6Reflection.Inner().new Private();
			Method meth = o.getClass().getDeclaredMethod("powerof2", Integer.TYPE);
			meth.setAccessible(true);
			String result = (String) meth.invoke(o, num);
			System.out.println(num + " is " + result);
			
//			o = new Object();
//			Inner.Private ip = (Inner.Private) o;
			//ip.powerof2(num);
			
			System.out.println("An instance of class: "+o.getClass().getCanonicalName()+" has been created");
			
			}//end of try
			
			catch (Do_Not_Terminate.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			}
		}//end of main
		static class Inner
		{
			private class Private{
				private String powerof2(int num)
				{
					return ((num&num-1)==0)?"power of 2":"not a power of 2";
				}
			}
		}//end of Inner
		
	}//end of Solution

	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
		


