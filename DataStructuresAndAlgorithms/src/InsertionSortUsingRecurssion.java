import java.util.Arrays;

public class InsertionSortUsingRecurssion {
	//This algorithm also partitions the array as sorted and
	//unsorted array.
	//Here we assume the first element is already sorted.
	//Assign the firstUnsortedElement as 1 and traverse to the right.
	//firstUnsortedIndex =1 - this is the first index of the unsorted partition
	//i = 0 - index used to traverse the sorted partition.
	//When we traverse the sorted Partition, we search for the right place to insert 
	//the element at firstUnsortedIndex.
	//
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		System.out.println(Arrays.toString(intArray));
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex< intArray.length; firstUnsortedIndex++) {
			findIndex(intArray, firstUnsortedIndex-1, intArray[firstUnsortedIndex], 0);
			System.out.println(Arrays.toString(intArray));
		}
		//System.out.println(Arrays.toString(intArray));

	}
	
	public static void findIndex(int[] input, int end, int pivot, int index) {
		if(end < 0) {
			input[end+1]=pivot;
			return;
		}
		if(input[end] < pivot) {
			input[end+1]=pivot;
			return;
		} 
		if(input[end] > pivot) {
			input[end+1]=input[end];
			index = end;
		} 
		findIndex(input, end-1, pivot, index);		
	}

}
