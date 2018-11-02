package anagramrecur;

public class anagramRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isAna("cinema", "icema")) {
			System.out.println("FOUND");
		} else {
			System.out.println("NOT FOUND");
		}

	}
	
	public static boolean isAna(String input, String find) {
		return isAna("", input, find);
	}
	
	public static boolean isAna(String ans, String remaining, String find) {
		if(remaining.contentEquals("")) {
			return find.equalsIgnoreCase(ans);
		}
		
		for(int i=0; i<remaining.length();i++) {
			if(isAna(ans+remaining.charAt(i), remaining.substring(0, i)+remaining.substring(i+1), find)) return true;
		}
		return false;
	}

}
