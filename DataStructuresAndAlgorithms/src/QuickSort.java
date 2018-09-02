import java.util.Arrays;

public class QuickSort {
	
	//Divide and Conqure algorithm
	//Recursive algorithm
	//Uses a pivot element to partition an element into two parts
	//Elements < pivot to its left
	//Elements > pivot to its right
	//Pivot will then be in its correct sorted position
	//
	//-Process is now repeated for all the elements in the right and left array
	//-Eventually, every element has been the pivot, so every element has to 
	//be in it's right position
    //As with merge sort we end of partitioning the array until a single element is found
	//Does this in in-place.
	// O(NlogN) - time complexity.
	//Unstable algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		quickSort(intArray, 0, intArray.length);
		System.out.println(Arrays.toString(intArray));		

	}
	
	public static void quickSort(int[] intArray, int start, int end) {
		int mid=0;
		if((end - start) < 2) {
			return;
		}
		
		mid = findPosition(intArray, start, end);
		quickSort(intArray, start, mid);
		quickSort(intArray, mid+1,end);	
		//System.out.println(Arrays.toString(intArray));
	}
	
	public static int findPosition(int[] input, int start, int end) {
		int i = start, j = end, pivot = input[start];
		
		while(i<j) {	
			while(i<j && input[--j]>=pivot);
			if(i<j) {
				input[i] = input[j];
			}
			while(i<j && input[++i]<=pivot);
			if(i<j) {
				input[j]=input[i];
				}
			//System.out.println("I: "+i+"J :"+j);
		}
		input[j] = pivot;
		return j;
	}
}
