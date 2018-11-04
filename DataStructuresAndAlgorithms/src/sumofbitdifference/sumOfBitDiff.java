package sumofbitdifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumOfBitDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {1,2,3,4};
		
		
		System.out.println("TOTAL NUM OF BIT DIFF: "+totalBitDiff(input));
		
		
	}
	
	public static int totalBitDiff(int[] input) {
		int first, second=0;
		int result=0;
		for(int i=0; i< input.length;i++) {
			first=input[i];
			for(int j=i; j<input.length;j++) {
				second = input[j];
				result= result+calBitDiff(first, second);				
			}			
		}
		return result;
	}
	
/*	public static int totalBitDiff(String ans, String remaining, int result) {
		
		if(remaining.isEmpty()) {
			return 0;
		}
		
			//ans.add(remaining.get(0));
			System.out.println("1: "+ans.toString()+"=="+remaining.toString()+"=="+result);
			totalBitDiff(ans+remaining.charAt(0), remaining.substring(1) , result);
			if (ans.length()==2) result= result+calBitDiff(ans);
			System.out.println("2: "+ans.toString()+"=="+remaining.toString()+"=="+result);
			totalBitDiff(ans, remaining.substring(1), result);
			if (ans.length()==2) result= result+calBitDiff(ans);
			return result;	
		
	}
	*/
	
	public static int calBitDiff(int first, int second) {
	    String int1 = Integer.toBinaryString(first);
	    String int2 = Integer.toBinaryString(second);
	    
	    int result=0;
	    String maxString = int1.length() > int2.length() ? int1: int2;
	    String minString = int1.length() < int2.length() ? int1: int2;
	    System.out.println("String: "+maxString+" "+minString);
	    System.out.println("length: "+maxString.length()+" "+minString.length());
	    for (int i=0; i<maxString.length(); i++ ) {
	    	if((i < maxString.length() - minString.length()) ) {
	    		System.out.println(i+" 1");
	    		if (maxString.charAt(i)=='1') result++;	    		
	    	} else {
	    		System.out.println(i+" 2");
	    		if(maxString.charAt(i)!=minString.charAt(i-(maxString.length()-minString.length()))) result++;
	    	}
	    }
	    System.out.println("Bit Difference: "+result);
		return result+result;
		
	}

}
