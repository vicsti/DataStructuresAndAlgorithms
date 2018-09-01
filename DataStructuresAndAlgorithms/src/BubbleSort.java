import java.util.Arrays;

public class BubbleSort {
	
	//Bubble sort os not the best of the sorts
	// ex Array: 20, 35, -15, 7, 55, 1, -22
	// In bubble sort we compare i, i+1 and then swap 
	// the element to the right if the a[i]>a[i+1] and then
	//increment the index i.
	// We then know that the largest number is at the right most element
	// so we divide the array into two logical partition
	// i. sorted and unsorted Partitions.
	//
	//
	
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			for(int i = 0; i< lastUnsortedIndex; i++ ) {
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}			
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
