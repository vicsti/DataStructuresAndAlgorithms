import java.util.Arrays;

public class SelectionSort {
	//This divides the array into sorted and unsorted array
	//We traverse the array and look for the unsorted element 
	//in the unsorted array. When we find the largest element 
	//we swap it with the last unsortedIndex. 
	//This is a in place algorithm
	//This is a O(N2) - Quadradic
	//This swap only once per loop. 
	//This is a unstable algorithm, since duplicate elements place is messed up.
	//
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
			int largest =0;
			for (int i=1; i<=lastUnsortedIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, lastUnsortedIndex);
		}
		System.out.println(Arrays.toString(intArray));

	}
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i]= array[j];
		array[j] = temp;
		
	}

}
