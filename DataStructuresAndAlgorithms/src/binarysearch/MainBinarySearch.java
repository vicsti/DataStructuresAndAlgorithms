package binarysearch;

import java.util.Arrays;

public class MainBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Binary Search works only if the input array are sorted.
		//
		//
		//
		//
		//
		//
		//
		//
		//
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		searchValue(array, 7, 0, array.length);
		searchValue(array, -23, 0, array.length);
		//searchValue(array, 37, 0, 7);
	}
public static void searchValue(int[] input , int value, int start, int end) {
		
		if(end - start < 2) {
			if (input[start] == value) {
				System.out.println("FOUND THE VALUE2 "+ value);				
			} else {
				System.out.println("VALUE NOT FOUND "+ value);
			}
			return;
		}
		
		int mid = (int) (end-start)/2;
		
		if(input[mid] == value) {
			System.out.println("FOUND THE VALUE1 "+ value);
			return;
		} else if (input[mid] > value) {
			searchValue(input, value,start,mid);
		} else if (input[mid] < value) {
			searchValue(input, value,mid,end );			
		}
				
	}

}
