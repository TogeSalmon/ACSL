import java.util.Arrays;
import java.util.Scanner;

public class JR0304_digits {
	
	static Scanner in;
	static int a[], largest, idx;
	
	
	public static void main(String[] args) {
	
		in = new Scanner(System.in);
		
		init();
		solve();
		
	}
	
	static void init() {
		char[] t = in.next().toCharArray();
		a = new int[t.length];
		
		//System.out.println(Arrays.toString(t));
		for(int i=0; i<t.length; i++) {
			a[i] = t[i] - '0';
		}
		//System.out.println(Arrays.toString(a));
	}
	
	static void solve() {
		
		//p1
		largest = a[0];
		idx = 0;
        
        //p2
		for(int i=1; i<a.length;i++) {
			if(largest < a[i]) {
				largest = a[i];
				idx = i;
			}
		}
        
        //p3
		if(largest%2==0) largest = (largest+4)%10;
		else largest = 0;
		
		a[idx] = largest;
		
		String ans = "";
		for(int x:a) {
			ans+=x;
		}
        
        //output
		System.out.println(Integer.parseInt(ans));
		
	}

}
