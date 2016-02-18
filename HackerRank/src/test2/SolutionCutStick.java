package test2;

import java.util.*;

public class SolutionCutStick {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int v = in.nextInt();
			list.add(v);
		}
		
		Collections.sort(list);
		
		
		while(list.size()>0){
			
			
			List<Integer> newList = new ArrayList<>();
			
			int cutSize = list.get(0);
			
			int counter = 0;
			for (Integer v:list){
				if (v > cutSize){
					newList.add(v-cutSize);
				}
			}
			
			System.out.println(list.size());
			list = newList;
		}
		
	}
}
