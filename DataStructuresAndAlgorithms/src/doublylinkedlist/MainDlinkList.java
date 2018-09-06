package doublylinkedlist;


public class MainDlinkList {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Victor", "Titus", 1);
		Employee emp2 = new Employee("Shiny", "Hebzibah", 2);
		Employee emp3 = new Employee("Jasper", "Daniel", 3);
		Employee emp4 = new Employee("Allwyn", "Peter", 4);
		Employee emp5 = new Employee("Sharon", "Allwyn", 5);
		
		EmployeeDlinkedList empDlist = new EmployeeDlinkedList(emp1);
		
		empDlist.addFirst(emp2);
		empDlist.addLast(emp4);
		empDlist.addLast(emp3);
		empDlist.addFirst(emp5);
		
		empDlist.printList();
	}

}
