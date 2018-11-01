package permutationrecur;

public class permutationRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permu("ABC");

	}
	
	public static void permu(String input) {
		permu("", input);		
	}
	
	private static void permu(String ans, String remaining) {
		if(remaining.contentEquals("")) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<remaining.length();i++) {
			permu(ans+remaining.charAt(i), remaining.substring(0, i)+remaining.substring(i+1));
		}		
	}

}
