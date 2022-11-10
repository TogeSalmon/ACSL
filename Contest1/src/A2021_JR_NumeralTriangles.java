import java.util.*;

public class A2021_JR_NumeralTriangles {
	
	static Scanner in;
	static int start, delta, rows, ans, n;
	static ArrayList<Integer> a;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		for(int i=0;i<5;i++) {

			init();
			solve();
		}
	}
	
	static void init() {
		start = in.nextInt();
		delta = in.nextInt();
		rows = in.nextInt();
		
		n = rows*(rows+1)/2;
		
		a = new ArrayList<Integer>();
		ans = 0;
	}
	
	static void solve() {
		for(int i=0; i<n; i++) {
			int sum;
			
			do {
				sum = 0;
				while(start > 0) {
					sum += start % 10; 
					start /= 10;
				}
				
				start = sum;
			}while(sum >= 10);
			
			a.add(start);
			start += delta;
		}
		
		for(int i=a.size()-1;i>=a.size()-rows; i--) {
			ans += a.get(i);
		}
		System.out.println(ans);
	}

}
