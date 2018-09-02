
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
		int leftLength=mid - start;
		int rightLength=end - mid;
		int i=0, j=0, k=0;
		
		
		while(i<leftLength && j< rightLength) {
			//tempArray[k++] = intArray[start] <= intArray[mid]
			
		}
	}

}
