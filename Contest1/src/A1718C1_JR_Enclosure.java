import java.util.*;

public class A1718C1_JR_Enclosure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
        
        //input
        String s = in.nextLine();
        
        //processing
        String ans = "";
        
        
        int p = s.indexOf("(") ;
        if(p >=0) {        //open P
            
            p += 1;
            p += 4;
            ans += p +" ";
            
            while(p < s.length()+1) {                
                p+=2;                
                ans = ans + " " + p;
            }
        }
        
        else{    //close P
            
            p = s.indexOf(")") + 1;
            p -= 3;
            ans = p+"";
            
            while(p > 1) {
                p-=2;
                ans = p + " " + ans;
            }            
        }
                
        System.out.println(ans);
		
	}

}

/*
 * 
 * (2+3*6+1
 * 2-5*(6+1
 * 5+5-2)*5
 * 3*5+(8/4*2
 * 2+8/4*5)
 */
