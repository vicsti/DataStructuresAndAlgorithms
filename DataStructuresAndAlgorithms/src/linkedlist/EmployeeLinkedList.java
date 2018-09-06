package linkedlist;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode node;
	int size;
			
	public EmployeeLinkedList(Employee emp) {
		node = new EmployeeNode(emp);
		node.setNext(head);
		head=node;	
		size++;		
	}
	
	public EmployeeLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void addToFront(Employee emp) {
		node = new EmployeeNode(emp);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		head=head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;		
	}
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head-->");
		while(current != null) {
			System.out.print(current.toString());
			System.out.print("--");
			current=current.getNext();			
		}		
	}

}
