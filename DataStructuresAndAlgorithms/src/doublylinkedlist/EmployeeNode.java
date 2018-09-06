package doublylinkedlist;

public class EmployeeNode {
	EmployeeNode next;
	EmployeeNode prev;
	Employee emp;
	
	public EmployeeNode(Employee emp) {
		this.emp=emp;		
	}
	
	public void printNode() {
		this.emp.toString();		
	}
		
}
