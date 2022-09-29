import java.util.*;

public class A1516C1_Chmod {
	
	static Scanner in;
	static String [] a = {"000", "001", "010", "011", "100", "101", "110", "111"};
	static String[] b = {"---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx"};
	static String f, s;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			solve();
		}
	}
	
	static void solve() {
		
		f="";
		s="";
		for(int i=0; i<3; i++) {
			int n = in.nextInt();
			f+= a[n] + " ";
			s+= b[n] + " ";
		}
		System.out.println(f+" and "+s);
	}

}
