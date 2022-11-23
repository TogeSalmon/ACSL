import java.util.Scanner;

public class A1617C2_IN_ASCENDING {
	
	static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		
		for(int i = 0;i<5; i++) {
			solve();
		}
		
	}
	
	static void solve(){
		
		String s = in.next();
		
		int n = s.charAt(0) - '0';
		s = s.substring(1);
		
		int cur = Integer.parseInt(s.substring(0, n));
		s = s.substring(n);
		
		s = new StringBuilder(s).reverse().toString();
		
		
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
