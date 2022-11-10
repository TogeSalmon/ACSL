import java.util.*;

public class A1819C1_Digit_Reassembly {
	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		solve();
		
		
	}
	
	static void solve() {
		//ans 1
		String s = in.next();
		System.out.println(s.length());
		
		//ans 2
		s = in.next();
		int ans2 = 0;
		for(int i=0; i<s.length(); i++) {
			ans2 += Integer.parseInt(s.substring(i,i+1));
		}
		System.out.println(ans2);
		
		//ans3
		s = in.next();
		int ans3 = 0;
		for(int i=0; i<s.length();i+=2) {
			ans3 += Integer.parseInt(s.substring(i, i+1));
		}
		System.out.println(ans3);
		
		//ans4 aka counting
		s = in.next();
		int ans4 = 0;
		int count = 0;
		for(int i=0; i<s.length();i++) {
			ans4 = Integer.parseInt(s.substring(i,i+1));
			if(ans4==4) {
				count++;
			}
		}
		System.out.println(count);
		
		//ans5
		s = in.next();
		int index = (s.length()-1)/2;
		System.out.println(s.charAt(index));
		
		
	}

}
