package atoirecurssion;

public class AtoiRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="1234";
		//System.out.print(AtoiRecurssion.strToInt(num.toCharArray(), num.length()));
		if(AtoiRecurssion.strToInt(num.toCharArray(), num.length())==1234) {
			System.out.print("String converted to int");
		}
	}
	
	public static int strToInt(char[] ch, int len) {
		if(len==1) return (int)ch[len-1] - '0';		
		return 10*strToInt(ch, len-1) + (int)ch[len-1] - '0';		
	}

}
