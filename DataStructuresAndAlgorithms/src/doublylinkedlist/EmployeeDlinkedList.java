package doublylinkedlist;

public class EmployeeDlinkedList {
	EmployeeNode head;	
	EmployeeNode tail;
	static int size;
	
	public EmployeeDlinkedList(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		head = tail = empNode;
		empNode.next=null;
		empNode.prev=null;	
		size++;
	}
	
	public void addFirst(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		head.prev=empNode;
		empNode.next=head;
		head=empNode;	
		size++;
	}
	
	public void addLast(Employee emp) {
		EmployeeNode empNode = new EmployeeNode(emp);
		tail.next=empNode;
		empNode.prev=tail;
		tail=empNode;	
		size++;
	}	
	
	public boolean addBefore(Employee empToAdd, Employee empRef) {
		EmployeeNode start=head;
		while(start.emp != empRef && start!=null) {
			start=start.next;
		}
		
		if(start.emp == empRef) {
			EmployeeNode empNode = new EmployeeNode(empToAdd);
			empNode.next=start;
			empNode.prev=start.prev;
			start.prev.next=empNode;
			start.prev=empNode;	
			return true;
		} else {
			return false;
		}		
	}
	
	public void removeFirst() {
		head=head.next;
		head.prev=null;
		size--;
		
	}
	
	public void removeLast() {
		tail=tail.prev;
		tail.next=null;
		size--;		
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		EmployeeNode current = head;
		
		System.out.print("HEAD-->");		
		while (current != null) {
			System.out.print(current.emp.toString());
			System.out.print("--");	
			current=current.next;
		}
		System.out.println();
	}

}
