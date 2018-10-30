package palindromicSubStrings;

public class palindromicSubStrings {
String st="this is crazy";

public static void main(String[] args) {
	
	palindromicSubStrings.testMethod("geeks");

	
}

public static void testMethod(String st) {
	for(int charCount=1; charCount<=st.length();charCount++) {
	    for (int i=0; i<st.length();i++) {
	    	if(i+charCount>st.length()) continue;
	    	String subString = st.substring(i, i+charCount);
	    	if(checkPalindrom(subString.toCharArray(), subString.length()-1)) {
	    		System.out.print(subString);
	    	}
	    	System.out.println();
	    }
	}
}

public static boolean checkPalindrom(char[] cha, int length) {
    if(cha==null) return false;
    if(length<0) return true;
    
    if(cha[length] != cha[cha.length-1-length]) {
        return false;
   }   
      
    return checkPalindrom(cha, length-1);
    
   	
}
}
