import java.util.*;
public class GolfProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalpar = 0;
		int totalscore = 0;
		for(int i=0; i<4; i++) {
			String[] in = input.nextLine().split(" ");
			int par = Integer.parseInt(in[0]);
			totalpar+= par;
			int score = Integer.parseInt(in[1]);
			totalscore+= score;
			
			if(par==score) {
				System.out.println("Par");
			}
			
			else if(score-par == -1) {
				System.out.println("Birdie");
			}
			
			else if(score-par == -2) {
				System.out.println("Eagle");
			}
			
			else if(score-par == 1) {
				System.out.println("Bogey");
			}
			
			else {
				System.out.println("Double Bogey");
			}
			
		}
		if(totalpar == totalscore) {
			System.out.println("Par");
		}
		else if(totalpar < totalscore) {
			System.out.println((totalpar-totalscore) + " under par");
		}
		else {
			System.out.println((totalscore - totalpar) + " over par");
		}
		
	}

}
