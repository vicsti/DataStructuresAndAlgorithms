package queues;


//Implementation of Circular Queue

public class MainQueue {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Victor", "Titus", 1);
		Employee emp2 = new Employee("Shiny", "Hebzibah", 2);
		Employee emp3 = new Employee("Jasper", "Daniel", 3);
		Employee emp4 = new Employee("Allwyn", "Peter", 4);
		Employee emp5 = new Employee("Sharon", "Allwyn", 5);
		Employee emp6 = new Employee("Selvin", "Raj", 6);
		Employee emp7 = new Employee("Victoria", "Selvin", 7);
		
		ArrayQueues queue = new ArrayQueues(5);
		
		queue.add(emp1);
		queue.add(emp2);
		queue.add(emp3);
		queue.add(emp4);
		queue.add(emp5);
		//queue.add(emp6);
		//queue.add(emp7);
		
		queue.printQueue();
		
		System.out.println("------------------------------ ");	
		
		queue.remove();
		queue.remove();
		queue.printQueue();
		
		System.out.println("------------------------------ ");
		
		queue.add(emp6);
		queue.add(emp7);
		
		queue.printQueue();
		System.out.println("------------------------------ ");
		queue.add(emp1);
		queue.add(emp2);
		queue.printQueue();
		
	}

}
