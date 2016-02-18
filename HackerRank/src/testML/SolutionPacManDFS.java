package testML;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class PMPoint {
	int x;
	int y;

	@Override
	public boolean equals(Object obj) {

		return (this.x == ((PMPoint) obj).x && this.y == ((PMPoint) obj).y);
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}

public class SolutionPacManDFS {

	static void dfs(int r, int c, int pacman_r, int pacman_c, int food_r,
			int food_c, String[] grid) {

		Stack<PMPoint> stack = new Stack<>();

		PMPoint pStart = new PMPoint();
		pStart.x = pacman_c;
		pStart.y = pacman_r;
		stack.add(pStart);

		int x = pacman_c;
		int y = pacman_r;
		
		Set<PMPoint> set = new HashSet<>(); 
		List<PMPoint> list = new ArrayList<PMPoint>();
		list.add(pStart);
		set.add(pStart);

		while (!((x == food_c) && (y == food_r))) {

			if (grid[y - 1].charAt(x) != '%') {
				PMPoint p = new PMPoint();
				p.x = x;
				p.y = y - 1;

				if (!stack.contains(p)) {
					stack.add(p);
				}
			}
			if (grid[y].charAt(x - 1) != '%') {
				PMPoint p = new PMPoint();
				p.x = x - 1;
				p.y = y;
				if (!stack.contains(p)) {
					stack.add(p);
				}
			}
			if (grid[y].charAt(x + 1) != '%') {
				PMPoint p = new PMPoint();
				p.x = x + 1;
				p.y = y;
				if (!stack.contains(p)) {
					stack.add(p);
				}
			}
			if (grid[y + 1].charAt(x) != '%') {
				PMPoint p = new PMPoint();
				p.x = x;
				p.y = y + 1;
				if (!stack.contains(p)) {
					stack.add(p);
				}
			}

			PMPoint nP = null ;
			while (set.contains(nP)){
			 nP = stack.pop();
			}
			
			x = nP.x;
			y = nP.y;

			list.add(nP);
			System.out.println(stack.size() + " " + nP);
		}

		System.out.println(list.size());
		for (PMPoint p:list){
			System.out.println(p.y + " "+p.x);
		}
		System.out.println(list.size()-1);
		for (PMPoint p:list){
			System.out.println(p.y + " "+p.x);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int pacman_r = in.nextInt();
		int pacman_c = in.nextInt();

		int food_r = in.nextInt();
		int food_c = in.nextInt();

		int r = in.nextInt();
		int c = in.nextInt();

		String grid[] = new String[r];

		for (int i = 0; i < r; i++) {
			grid[i] = in.next();
		}

		dfs(r, c, pacman_r, pacman_c, food_r, food_c, grid);
	}
}
