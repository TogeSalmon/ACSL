import java.util.*;
public class A1516C2_IN_String {
	
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		
		//#1 char_split
		String s = in.next();
		int n = in.nextInt();
		String c = in.next();
		
		String ans = "";
		int i = 0;
		for(;i<s.length()-n; i+=n) {
			ans += s.substring(i, i+n) + c;
			
		}
		ans += s.substring(i);
		System.out.println(ans);
		
		//#2 strrem
		s = in.next();
		c = in.next();
		
		ans = s.replace(c, ""); //replaces the first value w/ another thing
		System.out.println(ans);
		
		//#3 strchr
		s = in.next();
		c = in.next();
		n = s.indexOf(c);
		ans = s.substring(0, n);
		System.out.println(ans);
		
		//#4 strtock
		s = in.next();
		c = in.next();
		ans = s.replace(c,  " "+c);
		System.out.println(ans);
		
		//#5 wordwrap
		s = in.next();
		c = in.next();
		n = in.nextInt();
		ans = "";
		
		for(i=0; i<s.length(); i++) {
			
			int cnt = 0;
			
			while(true) {
				String ch = s.substring(i, i+1);
				
				if(ch.equals(c) || cnt == 3) {
					ans += " ";
					cnt = 0;
				}
				ans+= ch;
				cnt++;
				
				i++;
				
				if(i==s.length()) break;
			}
			
			
		}
		System.out.println(ans);
		
	}

}

/*
MISSISSIPPI 2 *

*/