package linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Victor", "Titus", 1);
		Employee emp2 = new Employee("Shiny", "Hebzibah", 2);
		Employee emp3 = new Employee("Jasper", "Daniel", 3);
		
		EmployeeLinkedList emplList = new EmployeeLinkedList();
		 System.out.println(emplList.isEmpty());
		
		emplList.addToFront(emp1);
		emplList.addToFront(emp2);
		emplList.addToFront(emp3);
		
		emplList.printList();	
		System.out.println(emplList.isEmpty());
	}

}
