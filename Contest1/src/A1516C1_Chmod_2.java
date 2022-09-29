import java.util.*;
public class A1516C1_Chmod_2 {
	static Scanner in;
	static String a [] = {"000", "001", "010", "011", "100", "101", "110", "111"};
	static String b [] = {"---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx"};
	static String f = "", s = "";
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			solve();
		}
	}
	
	static void solve() {
		
		f = "";
		s = "";
		for(int i=0; i<3; i++) {
			
			int n = in.nextInt();
			f+= a[n] + " ";
			s+= b[n] + " ";
		}
		
		System.out.println(f+" and "+s);
	}
}
/* 5 2 6
   7 3 0
   4 1 5
   2 3 4
   5 6 7
   1 0 4
   7 7 2
   6 3 5
   0 2 6
   5 2 7
 */
