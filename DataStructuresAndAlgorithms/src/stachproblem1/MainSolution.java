package stachproblem1;

import java.util.LinkedList;

public class MainSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Dont't nods";
		String lowerCase = input.toLowerCase();
		StringBuilder newStr = new StringBuilder(input.length());
		LinkedList<Character> stack = new LinkedList<Character>();
		
			
		for(int i=0; i<lowerCase.length();i++) {
			if(lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z') {
				newStr.append(lowerCase.charAt(i));
			stack.push(lowerCase.charAt(i));
			}
			}
		
		checkPal(newStr.toString(), stack);

		

	}
	
	public static boolean checkPal(String input, LinkedList<Character> stack) {
		
		for (int i=0; i<input.length();i++) {
			//System.out.println(in+" "+input.charAt(i));
			if(stack.pop() != input.charAt(i)) {
				System.out.println("Not a pal");
				return false;
			}
		}
		System.out.println("It is a pal");
		return true;
		
	}

}
