import java.util.*;
public class A1516C1_String {
	
	static Scanner in;
	static String str;
	static int a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		
		str =  in.nextLine();
		for(int i=0; i<5; i++) {
			init();
			solve();
		}

	}
	
	static void init() {
		a = in.nextInt();
		b = in.nextInt();
	}
	
	static void solve() {
		if(a<0) a = str.length()+a;
		
		if(b>0) b = a+b;
		
		else if(b==0) b = str.length();
		
		else b = str.length()+b;
		
		System.out.println(str.substring(a, b));
	}

}
