package stacksusingarrays;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStacks {
	//Stacks are abstract data type. Can be implemented by any data structure.
	//LIFO - Last In, First out
	//push - inserts the element on the Top of the stack
	//pop - Removes the element at the top of the stack
	//peek - Get the top element without removing it.
	//Ideal backing data structure is Linked List.
	// Dequeue class implements the stack
	//
	//
	//
	
	private Employee[] stack;
	private int top;
	
	public ArrayStacks(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee emp) {
		if (stack.length == top) {
			//Need to resize the array and 
			Employee[] temp = new Employee[2*top];			
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
		}
		stack[top++]=emp;
		
	}
	
	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Employee emp = stack[--top];
		stack[top]=null;
		return emp;
	}
	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];		
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	


	

}
