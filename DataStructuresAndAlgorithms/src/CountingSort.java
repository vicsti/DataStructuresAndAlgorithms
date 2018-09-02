import java.util.Arrays;

public class CountingSort {
	//Makes assumptions about the data being sorted.
	//Doesn't use comparison
	//Counts the number of occurrences
	//Only works with non-negative discrete values (cant work with floats, strings)
	//Values must be within a specific range
	//Time Complexity - O(N)
	//Not an in-place algorithm
	//This is a Unstable algorithm, this can be made to stable algorithm.
	//
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		
		System.out.println("Input Array: "+Arrays.toString(intArray));		
		countSort(intArray, intArray.length);
		System.out.println("Sorted Array: "+Arrays.toString(intArray));
	}
	
	public static void countSort(int[] input, int length) {
		int[] countArray = new int[length];
		int j =0;
		
		for(int i=0; i<input.length; i++) {
			countArray[input[i]-1]++;			
		}
		System.out.println("Count Array: "+Arrays.toString(countArray));
		for(int i=0;i<countArray.length; i++) {
			while(countArray[i]-- > 0) {
				input[j++] = i+1;
			}
		}	
	}
}
