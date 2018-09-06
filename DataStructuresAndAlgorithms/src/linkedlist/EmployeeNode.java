package linkedlist;

public class EmployeeNode {
	
	private Employee emp;
	private EmployeeNode next;
	
	public EmployeeNode(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmployee() {
		return emp;
	}
	
	public void setEmployee(Employee emp) {
		this.emp=emp;		
	}
	
	public EmployeeNode getNext() {
		return this.next;
	}
	
	public void setNext(EmployeeNode next) {
		this.next=next;
	}
	
    public String toString() {
        return emp.toString();
    }

}
