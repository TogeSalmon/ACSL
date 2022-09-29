import java.util.*;

public class AC10203_Asteriscks {
	
	static Scanner in;
	static char c;
	static int n1, n2;
	

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			init();
			solve();
		}
	}
	
	static void init() {
		c = in.next().charAt(0);
		n1 = in.nextInt();
		if(c=='B') n2 = in.nextInt();
	}
	
	static void solve() {
		
		if(c=='S') s();
		else if(c=='H') h();
		else if(c=='L') l();
		else b();
	}
	
	static void b() {
		for(int i=0; i<n2; i++) {
			for(int j=0; j<n1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void l() {
		for(int i=0; i<n1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void h() {

		for(int i=0; i<n1; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				for(int k=0; k<n1-i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	
	static void s() {
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
