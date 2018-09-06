package stackusinglinkedlist;

import java.util.LinkedList;

public class LinkedStack {
	LinkedList<Employee> list;
	
	public LinkedStack() {
		list = new LinkedList<Employee>();		
	}
	
	public void push(Employee emp) {
		list.push(emp);
	}
	public Employee pop() {
		return list.pop();		
	}
	public Employee peek() {
		return list.peek();
	}
	public int printSize() {
		return list.size();
	}
	public boolean isEmplty() {
		return list.isEmpty();
	}

}
