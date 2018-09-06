package doublylinkedlist;


public class MainDlinkList {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Victor", "Titus", 1);
		Employee emp2 = new Employee("Shiny", "Hebzibah", 2);
		Employee emp3 = new Employee("Jasper", "Daniel", 3);
		Employee emp4 = new Employee("Allwyn", "Peter", 4);
		Employee emp5 = new Employee("Sharon", "Allwyn", 5);
		Employee emp6 = new Employee("Selvin", "Raj", 6);
		Employee empToAdd = new Employee("Victoria", "Selvin", 7);
		
		EmployeeDlinkedList empDlist = new EmployeeDlinkedList(emp1);
		
		empDlist.addFirst(emp2);
		empDlist.addLast(emp4);
		empDlist.addLast(emp3);
		empDlist.addFirst(emp5);
		empDlist.addFirst(emp6);
		//empDlist.addFirst(emp7);
		
		empDlist.printList();
		System.out.println(empDlist.getSize());
		
		//empDlist.removeFirst();
		//empDlist.printList();
		//System.out.println(empDlist.getSize());
		
		//empDlist.removeLast();
		//empDlist.printList();
		//System.out.println(empDlist.getSize());
		
		empDlist.addBefore(empToAdd, emp4);
		empDlist.printList();		
		
	}

}
