package test2;

import java.io.IOException;
import java.security.Permission;
import java.util.Locale;
import java.util.Scanner;


class Calculate{
    
	Scanner sc = new Scanner(System.in);
	Locale loc = Locale.US;
	
	Out output = new Out();
	
    class Ret{

		public double main(int a){
	        double v = Math.pow((double) a,3);
	        return v ;
	    }
	    
	   public double main(int l, int b, int h){
	        double v = (double) l * (double) b * (double) h;
	        return v ;
	    }
	    
	   public double main(double r){
	        double v = (2.0 / 3.0) * Math.PI * Math.pow(r,3);
	        return v ;
	    }
	    
	    public double main(double r, double h){
	        double v = Math.PI * Math.pow(r,2) * h;
	        return v ;
	    }
    	
    }
    
    class Out{
    	public void display(double v){
    		System.out.printf("%.3f\n",v);
    	}
    }
    
    

	public int getINTVal() throws NumberFormatException, IOException {
		int v = sc.nextInt();
		if (v<=0){
			throw new NumberFormatException("All the values must be positive");
		}
		return v;
	}

	public double getDoubleVal() {
		double v = sc.nextDouble();
		if (v<=0){
			throw new NumberFormatException("All the values must be positive");
		}
		return v;
	}

	public static Ret get_Vol() {
		Ret ret = new Calculate().new Ret();
		
		return ret;
	}
}
public class SolutionVolume {
		
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Do_Not_Terminate.forbidExit();		
			try{
				Calculate cal=new Calculate();
				int T=cal.getINTVal();
				while(T-->0){
				double volume = 0.0d;		
				int ch=cal.getINTVal();			
				if(ch==1){
				
					int a=cal.getINTVal();
					volume=Calculate.get_Vol().main(a);
					
					
				}
				else if(ch==2){
				
					int l=cal.getINTVal();
					int b=cal.getINTVal();
					int h=cal.getINTVal();
					volume=Calculate.get_Vol().main(l,b,h);
					
				}
				else if(ch==3){
				
					double r=cal.getDoubleVal();
					volume=Calculate.get_Vol().main(r);
					
				}
				else if(ch==4){
				
					double r=cal.getDoubleVal();
					double h=cal.getDoubleVal();
					volume=Calculate.get_Vol().main(r,h);
					
				}
				cal.output.display(volume);
				}
						
			}
			catch (NumberFormatException e) {
				System.out.print(e);
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch (Do_Not_Terminate.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			}
			
			
		}
	}
	/**
	 *This class prevents the user from using System.exit(0)
	 * from terminating the program abnormally.
	 */
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {
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
	}//end of Do_Not_Terminate	
		


