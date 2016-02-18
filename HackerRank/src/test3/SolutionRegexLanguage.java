package test3;

import java.util.Scanner;

public class SolutionRegexLanguage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "\\d+\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)";

		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String s = sc.nextLine();

			if (s.matches(pattern)) {
				System.out.println("VALID");
			} else {
				System.out.println("INVALID");
			}
		}
	}
}
