import java.util.*;

public class A1920C1_JR_Transformation {
	
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
		n = in.next();
		p = in.nextInt();
		d = in.nextInt();
	}
	
	static void solve() {
		//step 1
		int idx = n.length()-p;
		int num = n.charAt(idx)-'0';
		//System.out.println(num);
		
		
		//step 2 & 3
		if(0<=num && num<=4) {
			num = num + d;
			num = num%10;
		}
		else {
			num = Math.abs(num - d);
			String temp = num +"";
			num = temp.charAt(0) - '0';
		}
		//System.out.println(num);
		
		//step 4
		ans = n.substring(0, idx) + num;
		System.out.println(ans);
		
		//step 5
		for(int i=0;i<p-1;i++) {
			ans+="0";
		}
		System.out.println(ans);
	}

}

//7145032 2 8
//1540670 3 54
