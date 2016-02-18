package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Checker{

	public Comparator<Player> desc = new Comparator<Player>(){

		@Override
		public int compare(Player arg0, Player arg1) {
			if (arg0.score > arg1.score){
				return 1;
			}else if (arg0.score == arg1.score){
				return -arg0.name.compareTo(arg1.name);
			}else{
				return -1;	
			}
		}
	};
}

class Player
{
	String name;
	int score;
}

public class SolutionC {

	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	  int N=Integer.parseInt(br.readLine().trim());
	  String s;
	  StringTokenizer st;
	  Player Player[]=new Player[N];
	  Checker check=new Checker();
	  for(int i=0;i<N;i++)
	  {
		  s=br.readLine().trim();
		  st=new StringTokenizer(s);
		  Player[i]=new Player();
		  Player[i].name=st.nextToken();
		  Player[i].score=Integer.parseInt(st.nextToken());
	  }
	 
	  Arrays.sort(Player,check.desc);
	  for(int i=0;i<Player.length;i++)
	  {
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
	  }

		
    }
}
