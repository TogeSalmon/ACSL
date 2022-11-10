import java.util.*;

public class A1920C1_IN_Transformation {
	
	static Scanner in;
	static String n, ans;
	static int p, d;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
		init();
		solve();
		}
	}
	
	static void init() {
		n = in.next(); //296351
		p = in.nextInt(); //5
		d = n.charAt(n.length()-p) - '0';
	}
	
	static void solve() {
		ans ="";
		
		for(int i=0; i<n.length()-p; i++) {
			int temp = n.charAt(i) - '0';
			temp += d ;
			temp %= 10;
			ans += temp;
		}
		
		ans += d;
		
		for(int i=n.length()-p+1; i<n.length();i++) {
			int temp = n.charAt(i) - '0';
			temp = Math.abs(temp-d);
			ans += temp;
		}
		
		System.out.println(ans);
	}

}