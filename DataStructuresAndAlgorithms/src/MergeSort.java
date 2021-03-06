import java.util.Arrays;

public class MergeSort {
	//Divide and conqure algorithm
	//recursive algorithm
	//Two Phases: Splitting and merging the arrays.
	//Splitting phase leads to faster sorting during the merging phase
	//Splitting is logical. We dont create new arrays.
	//
	//Splitting Phase:
	//-Start with an unsorted array
	//-Divide the array into two, Left and right arrray.
	//-Split the Left and Right array again and again untill you get down to a bunch of ONE element arrays,
    //Not-in-place. Uses temp arrays for merging.
	
	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(intArray, 0, intArray.length);
		System.out.println(Arrays.toString(intArray));

	}
	
	public static void mergeSort(int[] intArray, int start, int end){
		
		if ((end - start) < 2) {
			return;
		}
		int mid = (start + end)/2;
		
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, end);
		merge(intArray, start, mid, end);		
	}
	
	public static void merge(int[] intArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start];
		int i=start, j=mid, k=0;
		
		while(i<mid && j< end) {
			tempArray[k++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
		}
		while(i<mid) {
			tempArray[k++] = intArray[i++];			
		}
		while(j<end) {
			tempArray[k++] = intArray[j++];			
		}
		System.arraycopy(tempArray, 0, intArray, start, end - start);
		
	}

}
