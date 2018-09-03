import java.util.Arrays;

public class RadixSortStrings {
	//The key is to set the char ASCII array size to 126, we use the Radix as 126 instead of 26

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] radixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
		System.out.println(Arrays.toString(radixArray));
		radixSort(radixArray, 126, 5);
		System.out.println(Arrays.toString(radixArray));

	}
	
	public static void radixSort(String[] input, int radix, int width) {
		
		for(int i=0; i<width;i++) {
			radixSingleSort(input, radix, i);
		}		
	}
	
	public static void radixSingleSort(String[] input, int radix, int position) {
		int[] countArray = new int[radix];
		
		for (String value : input) {
			countArray[getChar(value, position, radix )]++;		
		}
		int prev=countArray[0];
		for (int i=1; i<countArray.length; i++) {
			prev = countArray[i] + prev;
			countArray[i]=prev;			
		}
		String[] temp = new String[input.length];
		for(int i=input.length-1; i>=0;i--) {
			temp[--countArray[getChar(input[i], position, radix)]]=input[i];			
		}
		System.arraycopy(temp, 0, input, 0, input.length);
		
	}
	
	public static int getChar(String value, int position, int radix) {
		/*int rem=0;
		for (int i=0; i<=position; i++) {
			rem=value%10;
			value=value/10;
		}*/
		return (int) value.charAt(value.length()-position-1);
	}

}
