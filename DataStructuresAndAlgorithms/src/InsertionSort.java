import java.util.Arrays;

public class InsertionSort {
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
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex< intArray.length; firstUnsortedIndex++) {
			int temp = intArray[firstUnsortedIndex];
			int index = 0;
			for(int i=firstUnsortedIndex-1; i>=0;i--) {
				if(intArray[i]> temp) {
					intArray[i+1]=intArray[i];
				} else {
					index=i+1;
					break;
				}
			}
			intArray[index]=temp;
		}
		System.out.println(Arrays.toString(intArray));

	}

}
