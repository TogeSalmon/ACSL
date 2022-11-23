import java.util.*;

public class A1617C2_JR_ASCENDING {
	
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		
		String s = in.next();
				
		
		int cur = s.charAt(0) - '0';
		s = s.substring(1);
		int next = 0;
		String ans = cur+" ";
		
		while(s.length() > 0) {
			
			next = next * 10 + (s.charAt(0) - '0');
			
			
			if(cur < next) {
				ans += next +" ";
				cur = next;
				next = 0;
				
			}
			
			s = s.substring(1);
			
		}
		System.out.println(ans);

	}

}

/*
 * 314159265
 * 11223344
 * 25897257
 * 91 
 * 9876543210
 * 
 * 1123581321345589
 * 19782017
 * 574839285638204927
 * 4
 * 2178281828
 */
