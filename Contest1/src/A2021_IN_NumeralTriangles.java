import java.util.ArrayList;
import java.util.Scanner;

public class A2021_IN_NumeralTriangles {

	static Scanner in;
	static int s, d, r, ans, n;
	static ArrayList<String> a;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		for(int i=0;i<5;i++) {

			init();
			solve();
		}
	}

	static void init() {
		s = Integer.parseInt(in.next(), 8);
		d = Integer.parseInt(in.next(), 8);
		r = in.nextInt();


		a = new ArrayList<String>();
		n = r * (r+1)/2;
	}

	static void solve() {
		for(int i=0; i<n; i++) {
			String oct = Integer.toOctalString(s);
			a.add(oct);

			s+=d;
		}
		
		//System.out.println(a);
		
		String line ="";
		for(int i = a.size()-r; i<a.size();i++) {
			line+= a.get(i);
		}
		//System.out.println(line);
		
		ans = 0;
		
		for(int i=0; i<line.length();i++) {
			ans+=line.charAt(i) - '0';
		}
		System.out.println(ans);
	}
}
