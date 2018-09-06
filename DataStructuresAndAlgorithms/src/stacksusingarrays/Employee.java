package stacksusingarrays;

public class Employee {
	String firstName;
	String lastName;
	int id;
	
	public Employee(String firstName, String lastName, int id) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;		
	}
	
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

}
