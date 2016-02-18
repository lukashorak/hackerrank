package testML;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Point{
	Integer x;
	Integer y;
}
public class SolutionBotClean {

	
	static void next_move(int posr, int posc, String[] board){
		int Y = board.length;
		int X = board[0].length();

		char[][] G = new char[Y][X];
		for (int y = 0; y < Y; y++) {
			G[y] = board[y].toCharArray();
		}

		int pX = 0;
		int pY = 0;
		int bX = posc;
		int bY = posr;
		
		boolean standOnDirt = true;
		
		List<Point> list = new ArrayList<>();
		
		for (int y = 0; y < Y; y++) {
			for (int x = 0; x < X; x++) {
				if (G[y][x] == 'd') {
					Point p = new Point();
					p.x = x;
					p.y = y;
					list.add(p);
				}
				if (G[y][x] == 'b') {
					standOnDirt = false;
				}
			}
		}
		
		if (standOnDirt){
			System.out.println("CLEAN");
			return;
		}
		Collections.sort(list, new Comparator<Point>(){

			@Override
			public int compare(Point o1, Point o2) {
				if (o1.y.equals(o2.y)){
					return o1.x.compareTo(o2.x);
				}
				return o1.y.compareTo(o2.y);
			}
			
		});
		
		Point target = list.get(0);
		pX = target.x;
		pY = target.y;

		for (int y = 0; y < Math.abs(pY - bY); y++) {
			if (pY > bY){
				System.out.println("DOWN");
				return;
			}else{
				System.out.println("UP");
				return;
			}
		}
		
		for (int x = 0; x < Math.abs(pX - bX); x++) {
			if (pX > bX){
				System.out.println("RIGHT");
				return;
			}else{
				System.out.println("LEFT");
				return;
			}
		}
	}

	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
}
