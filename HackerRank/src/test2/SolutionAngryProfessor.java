package test2;

import java.util.Scanner;

public class SolutionAngryProfessor {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            
            int onTime = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                
                if (a[a_i] <= 0){
                    onTime++;
                }
            }
            
            if (onTime >= k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}