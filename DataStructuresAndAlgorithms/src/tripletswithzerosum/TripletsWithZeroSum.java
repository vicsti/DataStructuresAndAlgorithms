package tripletswithzerosum;

import java.util.HashSet;
// https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/

public class TripletsWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0, -1, 2, -3, 1};
		
		findTriplets(input, input.length);
	}
	
	public static void findTriplets(int[] input, int size) {
		int first, second, third=0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<size; i++) {
			first=input[i];
			for(int j=0;j<size;j++) {
				if(j==i) continue;
				second=input[j];
				third=-first-second;
				if(set.contains(third)) {
					System.out.println("FIRST: "+first+" SECOND: "+second+" THIRD: "+third);
					first=second=third=0;
					set.clear();
					break;
				} else {
					set.add(third);
				}				
			}
			
		}
	}

}
