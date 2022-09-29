import java.util.*;
public class _1819coding {
	static Scanner in;
	static String s1, s2, s3, s4, s5;
	static String output;

	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	public static void init() {
		in = new Scanner(System.in);
		s1 = in.next();
		s2 =in.next();
		s3 = in.next();
		s4 = in.next();
		s5 = in.next();

		output = "";
	}

	public static void solve() {
		output += s1.length() + "\n";

		int sum = 0;
		for(int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			sum += c - '0';
		}
		output += sum + "\n";

		sum = 0;
		for(int i = 0; i < s3.length(); i+=2) {
			char c = s3.charAt(i);
			sum += c - '0';
		}
		output += sum + "\n";
		
		int count4 = 0;
		for(int i = 0; i<s4.length(); i++) {
			if(s4.charAt(i) == '4') {
				count4++;
			}
		}
		output += sum + "\n";
		
		char c = s5.charAt((s5.length() - 1) / 2);
		output += count4 + "\n";
	}

	public static void output() {
		System.out.println(output);

	}
}
