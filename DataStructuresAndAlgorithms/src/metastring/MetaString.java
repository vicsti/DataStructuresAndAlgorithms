package metastring;

public class MetaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkMetaString("rsting".toCharArray(), "string".toCharArray())) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}
	
	public static boolean checkMetaString(char[] str1, char[] str2) {
		char char1='\u0000';
		char char2='\u0000';
		boolean flag=false;
		
		if((str1.length!=str2.length) || (str1==null || str2==null)) return false;
		
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=str2[i]) {
				if(flag) {
					if((char1!=str2[i]) || (char2!=str1[i])) {
						System.out.println("char1 "+char1+" char2 "+char2+" str1 "+str1[i]+" str2 "+str2[i]);
						return false;						
					} 					
				}
				char1=str1[i];
				char2=str2[i];
				flag=true;				
			}
		}
		
		
		return true;
		
	}

}
