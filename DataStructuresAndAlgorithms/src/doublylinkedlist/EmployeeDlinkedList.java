package doublylinkedlist;

public class EmployeeDlinkedList {
	EmployeeNode head;	
	EmployeeNode tail;
	
	public EmployeeDlinkedList(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		head = tail = empNode;
		empNode.next=null;
		empNode.prev=null;				
	}
	
	public void addFirst(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		head.prev=empNode;
		empNode.next=head;
		head=empNode;		
	}
	
	public void addLast(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		tail.next=empNode;
		empNode.prev=tail;
		tail=empNode;		
	}	
	
	public void printList() {
		EmployeeNode current = head;
		
		System.out.print("HEAD-->");		
		while (current != null) {
			System.out.print(current.emp.toString());
			System.out.print("--");	
			current=current.next;
		}		
	}

}
