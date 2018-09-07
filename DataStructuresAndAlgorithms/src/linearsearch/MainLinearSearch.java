package linearsearch;

public class MainLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		System.out.println(linearSearch(array, -22));
		System.out.println(linearSearch(array, 888));
		System.out.println(linearSearch(array, 35));

	}
	
	public static int linearSearch(int[] input, int value) {
		for (int i=0;i<input.length; i++) {
			if (input[i]==value) {
				return i;
			}
		}
		return -1;
	}

}
