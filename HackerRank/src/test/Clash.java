package test;

public class Clash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clash c = new Clash();
		c.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		StringBuffer sbOut = new StringBuffer();
		sb.append("'spaces and    tabs'");
		
		String s = sb.toString();
		boolean esc = false;
		for (int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if ('\'' == c) {
				esc = !esc;
			}
			if (!esc){
				if (c == '\n' || c == ' ' || c == '\t'){
					
				} else{
					sbOut.append(c);
				}
				
//				sbOut.append(si);
			}else{
				sbOut.append(c);
			}
		}
		System.out.println(sbOut.toString());
		
		
		
	}

}
