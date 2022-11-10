
public class ConvertComputerNumber {

	public static void main(String[] args) {
		int n = 10;
		String octal = Integer.toOctalString(n);
		String hex = Integer.toHexString(n);
		String bin = Integer.toBinaryString(n);
		
		System.out.println(octal);
		System.out.println(hex);
		System.out.println(bin);
		
		int oti = Integer.parseInt(octal, 8);
		int htoi = Integer.parseInt(hex, 16);
		int btoi = Integer.parseInt(bin, 2);
		
		System.out.println(oti);
		System.out.println(htoi);
		System.out.println(btoi);


	}

}
