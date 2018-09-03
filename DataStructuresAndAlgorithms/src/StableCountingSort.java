
public class StableCountingSort {
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

	}

}
