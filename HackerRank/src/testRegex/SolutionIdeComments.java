package testRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionIdeComments {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		while(sc.hasNextLine()){
			sb.append(sc.nextLine());
			sb.append("\n");
		}
		
		Pattern pMultiline = Pattern.compile("(?s)(/\\*.*?\\*/|//[^\\n]*\\n)", Pattern.DOTALL);
		
		Matcher mMultiline = pMultiline.matcher(sb.toString());
		
		while(mMultiline.find()){
			String comment = mMultiline.group(1);
			
			System.out.print(comment);
		}
	}

}
