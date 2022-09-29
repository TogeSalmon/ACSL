import java.util.*;


public class JR1617_Agram {
	
	static Scanner in;
	static ArrayList<Integer> cardNum;
	static String dealerSuit;
	static int dealerNum;
	

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
	}
	
	static void init() {
		dealerNum = in.nextInt();
		dealerSuit = in.next();
		
		cardNum = new ArrayList<Integer>();
	}
	
	static void solve() {
		
		for(int i=0; i<5; i++) {
			int num = in.nextInt();
			String s = in.next();
			if(dealerSuit.equals(s)) {
				cardNum.add(num);
			}
		}
		Collections.sort(cardNum);
		int ans = -1;
		for(int i=0; i<cardNum.size(); i++) {
			if(dealerNum < cardNum.get(i)) {
				ans = cardNum.get(i);
				break;
			}
		}
		//System.out.println(cardNum);
		if(cardNum.size() == 0) {
			System.out.println("NONE");
		}
		else {
			if(ans == -1) {
				System.out.println(cardNum.get(0) + dealerSuit);
			}
			else {
				System.out.println(ans + dealerSuit);
			}
		}
	}
	// 2 D 3 D 1 D 4 D 6 H 7 S
}
