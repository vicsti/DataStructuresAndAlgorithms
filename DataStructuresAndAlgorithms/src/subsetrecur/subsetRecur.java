package subsetrecur;

public class subsetRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSet("ABC");

	}
	
	public static void subSet(String input) {
		subSet("", input);
		
	}
	
	private static void subSet(String ans, String remaining) {
		if(remaining.contentEquals("")) {
			System.out.println(ans+",");
			return;
		}
		
		subSet(ans+remaining.charAt(0), remaining.substring(1));
		subSet(ans,remaining.substring(1));
	}

}
