import java.util.*;

public class A0405C1_Poker {
	
	static Scanner in;
	static int b[];
	static int a[];
	static boolean two, three, four;
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
			init();
			solve();

	}
	
	static void init() {
		
		b = new int[14];
		for(int i=0; i<5; i++) {
			 
			b[in.nextInt()%13]++;
		}
		
		//System.out.println(Arrays.toString(b));
	}
	
	static void solve() {
		boolean two = false;
		boolean three = false;
		boolean four = false;
		
		for(int i=0; i<b.length; i++) {
			if(b[i] ==2) two = true;
			
			else if(b[i] == 3) three = true;
			
			else if (b[i] == 4) four = true;
			
		}
		if(two && three) System.out.println("FULL HOUSE");
		
		else if(two) System.out.println("A PAIR");
		
		else if(three) System.out.println("THREE OF A KIND");
		
		else if(four) System.out.println("FOUR OF A KIND");
		
		else System.out.println("NONE");
	}
}
