package stacksusingarrays;


public class MainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Victor", "Titus", 1);
		Employee emp2 = new Employee("Shiny", "Hebzibah", 2);
		Employee emp3 = new Employee("Jasper", "Daniel", 3);
		Employee emp4 = new Employee("Allwyn", "Peter", 4);
		Employee emp5 = new Employee("Sharon", "Allwyn", 5);
		Employee emp6 = new Employee("Selvin", "Raj", 6);
		Employee emp7 = new Employee("Victoria", "Selvin", 7);
		
		ArrayStacks stack = new ArrayStacks(4);
		
		stack.push(emp1);
		stack.push(emp2);
		stack.push(emp3);
		stack.push(emp4);
		stack.push(emp5);
		stack.push(emp6);
		stack.push(emp7);
		
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		
		System.out.println(stack.peek().toString());
		System.out.println(stack.pop().toString());
		

	}

}
