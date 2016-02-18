package test2;

import java.math.BigDecimal;
import java.util.*;

class Num implements Comparable<Num>{
	public BigDecimal bd;
	public String str;
	public Integer pos;
	
	
	@Override
	public int compareTo(Num arg0) {
		// TODO Auto-generated method stub
		
		if (this.bd.equals(arg0.bd)){
			return -this.pos.compareTo(arg0.pos);
		}
		return -this.bd.compareTo(arg0.bd);
	}
}

public class SolutionBigDecimal {

	
	public static void main(String[] argh) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		final List<Num> bdList = new ArrayList<Num>();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			
			Num num = new Num();
			num.bd = new BigDecimal(str);
			num.str = str;
			num.pos = i;
			
			bdList.add(num);
		}
		
		// Write your code here
		Collections.sort(bdList);

		// Output
		for (int i = 0; i < n; i++) {
			String v = bdList.get(i).str;
			System.out.println(v);
		}

	}

}
