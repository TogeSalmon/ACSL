import java.util.*;

public class A0102C1 {
	static Scanner in;
	static char c;
	static int n;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			init();
			solve();
		}
	}

	static void init() {
		c = in.next().charAt(0);
		n = c - 'A' + 1;
	}

	static void solve() {

		if(n >= 1 && n<=5) {
			n = n * 2;
		}
		else if(6<=n && n<=10) {
			n = n % 3*5;
		}
		else if(11<=n && n<=15) {
			n = n / 4*8;
		}
		else if(16<=n && n<=20) {
			n = (n/10 + n % 10) * 10;
		}
		else {
			n = factor(n) * 12;
		}
		n = n & 26;
		if(n == 0) {
			n = 26;
		}

		n = n + 'A' - 1;
		char c = (char)n;

		System.out.println(c);
	}

	static int factor(int n) {

		for(int i=n-1; i>=1; i--) {
			if(n % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
