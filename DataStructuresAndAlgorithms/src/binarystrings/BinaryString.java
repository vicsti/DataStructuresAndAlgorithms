package binarystrings;
//Generate all binary strings from given pattern
public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1??0?101";
		generateBinStr("", str);

	}

	private static void generateBinStr(String ans, String str) {
		// TODO Auto-generated method stub
		//null check
		if(str==null || ans==null) return;
		//base case
		if(str.isEmpty()) {
			System.out.println("STRING :"+ans);
			return;
		}

		if(str.charAt(0)=='?') {
			generateBinStr(ans+'0', str.substring(1));
			generateBinStr(ans+'1', str.substring(1));
		} else {
			generateBinStr(ans+str.charAt(0),str.substring(1));
		}
	}

}
