package Generics;
import java.util.*;

class Employee {
	Employee(int id, String name, int salary, String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	int id;
	String name;
	int salary;
	String department;
	void displayDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
	}
}

public class Question1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"A",5000,"X");
		Employee e2 = new Employee(2,"B",6000,"Y");
		Employee e3 = new Employee(3,"C",7000,"Z");
		int a = 5;
		
		HashSet<Employee> hs = new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
//		hs.add(a); ---> error
		
		Iterator<Employee> i = hs.iterator();
		while(i.hasNext()) {
			i.next().displayDetails();
		}

	}

}
