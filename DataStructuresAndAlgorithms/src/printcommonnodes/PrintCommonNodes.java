package printcommonnodes;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintCommonNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tree tr1 = new Tree(5);
		tr1.addNode(1);
		tr1.addNode(10);
		tr1.addNode(0);
		tr1.addNode(4);
		tr1.addNode(7);
		tr1.addNode(9);
				
		
		Tree tr2 = new Tree(10);
		tr2.addNode(7);
		tr2.addNode(20);
		tr2.addNode(4);
		tr2.addNode(9);
		
		System.out.println(tr1.getSize());
		System.out.println(tr2.getSize()+"\n===========");
		
		ArrayList<Integer> array1 =   tr1.getDataTraveredInOrder(tr1.getSize());
		ArrayList<Integer> array2 = tr2.getDataTraveredInOrder(tr2.getSize());
		
		System.out.println(array1.toString());
		System.out.println(array2.toString());
		
		printIntersection(array1.toArray(), array2.toArray());		
  }

	private static void printIntersection(Object[] array1, Object[] array2) {
		// TODO Auto-generated method stub
		int m = array1.length, n = array2.length, i=0,j=0;
		
		while(i<m && j < n) {
			if((int)array1[i] < (int)array2[j]) {
				i++;
			} else if ((int)array1[i] > (int)array2[j]) {
				j++;
			} else {
				System.out.print((int)array1[i]+" ");
				i++;
				j++;
			}
		}		
	}

}
