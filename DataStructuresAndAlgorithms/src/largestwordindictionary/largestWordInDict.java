package largestwordindictionary;

public class largestWordInDict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] dict = {"ale", "apple", "monkey", "plea"};
		String[] dict = {"pintu", "geeksfor", "geeksgeeks", "forgeek"};
		String str="geeksforgeeks";
		int[] freqTable=buildCharFreq(str.toCharArray());
		System.out.println(findLargestWord(dict, freqTable));
	}
	
	private static String findLargestWord(String[] dict, int[] freqTable) {
		int[] temp = new int[freqTable.length];
		String largest="";
		String word="";
		
		for(int i=0;i<dict.length;i++) {
			System.arraycopy(freqTable, 0, temp, 0, freqTable.length);
			word=wordFound(dict[i].toLowerCase(), temp);
			if(largest.length()<word.length()) {
				largest=word;
			}			
		}
		return largest;
	}
	
	private static String wordFound(String str, int[] freqTable) {
		
		for(int i=0; i<str.length();i++) {
			if(--freqTable[(int)str.charAt(i) - 'a']<0) return "";
		}		
		return str;	
	}

	private static int[] buildCharFreq(char[] str) {
		int[] freqTable=new int[26];
		if(str.length==0 || str==null) return null;
		
		for(int i=0;i<str.length;i++) {
			if(str[i]>='a' && str[i]<='z') {
				freqTable[(int)str[i]-'a']++;
			}
		}		
		return freqTable;		
	}

}
