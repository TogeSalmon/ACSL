import java.util.*;
public class A0607_Probability {
	
	static Scanner in;
	static int n, even, odd;
	static int a[] = {0, 16,16,8, 8, 4, 4, 2, 2, 1, 1};

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			solve();
		}
		
	}
	
	static void solve() {
		
		n = in.nextInt();
		even = 1;
		odd = 1;
		
		while(n!=0) {
			if(n%2==0) even += a[n];
			else odd += a[n];
			n = in.nextInt();
		}
		
		System.out.println(even+"/"+odd);
	}

}
