package model;

public class Employee extends User {
	
	public double salary;
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(String name, String surname, int age, String email, String userName, String password) {
		super();
	}

	public Employee(String name, String surname, int age,
			double salary) {
		
		super(name, surname, age, surname);
		
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return super.toString() + "\nEmployee [salary=" + salary + "]";
	}


	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
