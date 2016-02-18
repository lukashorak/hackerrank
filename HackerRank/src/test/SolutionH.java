package test;

import java.util.*;

class Group {
	Integer a;
	Integer b;
	Integer minAbsDiff;
}

public class SolutionH {

	public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	Integer[] arr = new Integer[N];
    	for (int i = 0;i<N;i++){
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	
    	Integer minAbsDiff = Math.abs(arr[1] - arr[0]);    	
    	for (int i=1;i<N;i++){
    		minAbsDiff = Math.min(minAbsDiff, Math.abs(arr[i] - arr[i -1]));
    	}
    	
//    	System.out.println(minAbsDiff);
    	List<Group> list= new ArrayList<>();
    	for (int i=1;i<N;i++){
    		Group g = new Group();
    		g.a = arr[i-1];
    		g.b = arr[i];
    		g.minAbsDiff = Math.abs(arr[i] - arr[i -1]);
    		list.add(g);
    	}
    	
    	Collections.sort(list, new Comparator<Group>(){

			@Override
			public int compare(Group o1, Group o2) {
				// TODO Auto-generated method stub
				if (o1.minAbsDiff.equals(o2.minAbsDiff)){
					return o1.a.compareTo(o2.a);
				}
				return o1.minAbsDiff.compareTo(o2.minAbsDiff);
			}
    	});
    	
//    	Integer min = list.get(0).minAbsDiff;
    	for (Group g:list){
    		if (g.minAbsDiff.equals(minAbsDiff)){
    			System.out.print(g.a + " "+g.b+" ");
    		}else{
    			break;
    		}
    	}
    }
}
