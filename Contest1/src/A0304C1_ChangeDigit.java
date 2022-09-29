import java.util.*;

public class A0304C1_ChangeDigit {
	
	static Scanner in;
	static char c[];
	static int a[], max, maxIndex;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			init();
			solve();
		}
	}
	
	static void init() {
		c = in.next().toCharArray();
		a = new int[c.length];
		
		for(int i=0; i<c.length; i++) {
			a[i] = c[i] - '0';
		}
		//System.out.println(Arrays.toString(a));
	}
	
	static void solve() {
		
		max = a[0];
		maxIndex = 0;
		
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		
		if(max%2==0) max = (max+4)%10;
		else max = 0;
		
		a[maxIndex] = max;
		
		String ans = "";
		for(int x:a)
			ans+=x;
		
		System.out.println(Integer.parseInt(ans));
	}

}
