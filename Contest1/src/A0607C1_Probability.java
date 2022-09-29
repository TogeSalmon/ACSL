import java.util.*;
public class A0607C1_Probability {
	
	static Scanner in;
	static int bot, top, r, b, op;
	static char c1, c2, re;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		for(int i=1; i<=8; i++) {
			init();
			solve();
		}
	}
	
	static void init() {
		op = in.nextInt();
		r = in.nextInt();
		b = in.nextInt();
		
		if(op==1) c1 = in.next().charAt(0);
		else {
			
			re = in.next().charAt(0);
			c1 = in.next().charAt(0);
			c2 = in.next().charAt(0);
			
		}
	}
	
	static void solve() {
		bot = r+b;
		top = c1=='R'? r:b;
		
		if(op == 2) {
			if(re =='Y') {
				
				bot *= bot;
				top *= c2=='R'? r:b;
			}
			
			else {
				bot *= bot-1;
				top *= c1==c2? top-1 : c2=='R'? r:b;
			}
		}
		
		System.out.println(top + "/"+ bot);
	}

}
