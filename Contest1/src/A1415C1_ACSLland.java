import java.util.*;
public class A1415C1_ACSLland {
	
	static Scanner in;
	static int a[] = {450, 140, 120, 320, 250, 80};
	static double cost, mph, mpg;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		mpg = in.nextDouble();
		cost = in.nextDouble();
		mph = in.nextDouble();
		
		for(int i=0; i<5;i++) {
			solve();
		}
	}
	
	static void solve() {
		int start = in.next().charAt(0)-'A';
		int end = in.next().charAt(0)-'A';
		
		int d = 0;
		for(int i=start; i<end; i++) {
			d+=a[i];
		}
		
		double time = d/mph;
		int h = (int) time;
		int m = (int)Math.round((time - h) * 60);
		double money = d/mpg * cost;
		
		System.out.printf("%d %02d:%02d $%.2f\n", d, h, m, money);
		
	}

}
