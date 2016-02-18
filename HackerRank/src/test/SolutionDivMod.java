package test;

import java.util.Scanner;

public class SolutionDivMod {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int buy = n / c;
            
            int wrappersBuy = buy / m;
            int wrappersRest = buy % m;
            
            int wrappersSecondRound = (wrappersRest + wrappersBuy) / m;
            int wrappersSecondRoundRest = (wrappersRest + wrappersBuy) % m;
            
            int wrappersThirdRound = (wrappersSecondRoundRest + wrappersSecondRound) / m;
            int wrappersThirdRoundRest = (wrappersSecondRoundRest + wrappersSecondRound) % m;
            
            int wrappersFourthRound = (wrappersThirdRound + wrappersThirdRoundRest) / m;
            
            int v = buy+wrappersBuy+wrappersSecondRound + wrappersThirdRound + wrappersFourthRound;
            System.out.println(v);
            
            //TODO
//            int buy2 = n/c;
//            int wrappersBuy2 =  buy2 / m;
//            
//            do{
//            	int wrappersLeft = buy2 % m;
//                int wrappersRound =  (wrappersBuy + wrappersLeft) / m;
//                wrappersBuy2 = (wrappersBuy + wrappersLeft ) % m;
//                buy2+=wrappersBuy2;
//            	
//            }while (wrappersBuy2 > 0);
//            
//            
//            
//            
//            System.out.println(buy2);
        }
    }
}