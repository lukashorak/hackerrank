package testML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	class Pixel{
	    int r,g,b;
	}
	public class SolutionDayNight {

	    public static void main(String[] args) throws FileNotFoundException {
	        Scanner sc = new Scanner(new File("inImg.txt"));
//	        Scanner sc = new Scanner(System.in);
	        
	        List<Pixel> list = new ArrayList<>();
	        String line = sc.nextLine();
	        String[] groups = line.split(" ");
	        for (String g:groups){
	            String[] v = g.split(",");
	            Pixel p = new Pixel();
	            p.r = Integer.valueOf(v[0]);
	            p.g = Integer.valueOf(v[1]);
	            p.b = Integer.valueOf(v[2]);
	            list.add(p);
	        }
	        
	        double avgShade = 0.0;
	        for (Pixel p :list){
	            avgShade += ((double)p.r + (double)p.g + (double)p.b)/(double) list.size();
	        }
	        System.out.println(avgShade);
	        if (avgShade > 150){
	            System.out.println("day");
	        }else{
	            System.out.println("night");
	        }
	    }
	}