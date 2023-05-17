package Oops_Assignment;

class Employee{
	int sal;
	public void salary() {
		System.out.println("Employee Salary: " + sal);
	}
}

class Manager extends Employee{
	int incentive;
	@Override
	public void salary() {
		System.out.println("Manager Salary: " + (sal+incentive));
	}
}

class Labour extends Employee{
	int overtime;
	@Override
	public void salary() {
		System.out.println("Labour Salary: " + (sal+overtime));
	}
}
public class Question_2 {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Manager m = new Manager();
		Labour l = new Labour();
		
		e.sal = 5000;
		m.incentive = 3000; m.sal = 5000;
		l.overtime = 3000; l.sal = 5000;
		
		e.salary();
		m.salary();
		l.salary();

	}

}