import java.util.Arrays;

public class RadixSort {
	//Makes assumptions about the data 
	//Data must have same radix and width
	//Because of this, data must be integer or String
	//Sort based on each individual digit or letter position
	//Start at the rightmost position
	//Must use a stable sort algorithm at each stage.
	//
	//CountingSort is often used as the sort algorithm for Radix Sort
	//O(N) - can be achieve this because we are making assumptions of the data.
	//Even so, it runs slower than O(NlogN) because of the overhead involved.
	//In-Place, depends on which sort algorithm we use
	//Stable algorithm
	
	//Requires extra steps
	//Can calculate where values should be written back to the original array
	//Writing the values into the array in backwards order ensures stability.
	//This works because we traverse the input array from right to left, and we write duplicate values into temp
	//array from right to left
	//If we know that duplicate vaulues will go into positions 3 and 4
	//we write the right most value in the input array into position 4,
	//and the left most value into position 3.
	//This preservers the relative positioning of duplicate values.
	//By Adjusting the counting array after the intial pass, we map values to indices in the temp array.
	//Can also use linked list to make counting sort stable 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		System.out.println(Arrays.toString(radixArray));
		radixSort(radixArray, 10, 4);
		System.out.println(Arrays.toString(radixArray));

	}
	
	public static void radixSort(int[] input, int radix, int width) {
		
		for(int i=0; i<width;i++) {
			radixSingleSort(input, radix, i);
		}		
	}
	
	public static void radixSingleSort(int[] input, int radix, int position) {
		int[] countArray = new int[radix];
		
		for (int value : input) {
			countArray[getDigit(value, position, radix )]++;		
		}
		int prev=countArray[0];
		for (int i=1; i<countArray.length; i++) {
			prev = countArray[i] + prev;
			countArray[i]=prev;			
		}
		int[] temp = new int[input.length];
		for(int i=input.length-1; i>=0;i--) {
			temp[--countArray[getDigit(input[i], position, radix)]]=input[i];			
		}
		System.arraycopy(temp, 0, input, 0, input.length);
		
	}
	
	public static int getDigit(int value, int position, int radix) {
		/*int rem=0;
		for (int i=0; i<=position; i++) {
			rem=value%10;
			value=value/10;
		}*/
		return value / (int) Math.pow(10, position) % radix;
	}

}
