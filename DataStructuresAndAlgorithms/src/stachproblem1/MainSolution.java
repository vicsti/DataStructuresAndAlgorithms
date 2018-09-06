package stachproblem1;

import java.util.LinkedList;

public class MainSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "MALAYALA";
		LinkedList<Character> stack = new LinkedList<Character>();
		
		for(int i=0; i<input.length();i++) {
			stack.push(input.charAt(i));
			}
		
		checkPal(input, stack);

		

	}
	
	public static boolean checkPal(String input, LinkedList<Character> stack) {
		int i=0;
		for (Character in : stack) {
			if(in != input.charAt(i++)) {
				System.out.println("Not a pal");
				return false;
			}
		}
		System.out.println("It is a pal");
		return true;
		
	}

}
