package Collections;
import java.util.*;

class Employee {
	Employee(int id, String name, String department, int salary){
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	int id, salary;
	String name, department;
	
	public String toString() {
		return ("ID = " + id + ", Name = " + name + ", Department = " + department + ", Salary = " + salary);
	}
}

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Employee> t = new HashSet<>();
		System.out.println("Enter an option: \n a) ID \n b) Name \n c) Department \n d) Salary");
		char c = sc.next().charAt(0);
		
		t.add(new Employee(123, "A", "Science", 50000));
		t.add(new Employee(224, "B", "Finance", 60000));
		t.add(new Employee(353, "C", "Computer", 70000));
		t.add(new Employee(983, "D", "Economics", 40000));
		t.add(new Employee(443, "E", "Games", 30000));
		
		ArrayList<Employee> e = new ArrayList<>(t);
		
		Comparator<Employee> id_cmp = new Comparator<>() {
			public int compare(Employee a, Employee b) {
				if(a.id==b.id)
					return 0;
				else if(a.id>b.id)
					return 1;
				else
					return -1;
			}
		};
		
		Comparator<Employee> name_cmp = new Comparator<>() {
			public int compare(Employee a, Employee b) {
				if(a.name.equals(b.name))
					return 0;
				else
					return a.name.compareTo(b.name);
			}
		};
		
		Comparator<Employee> department_cmp = new Comparator<>() {
			public int compare(Employee a, Employee b) {
				if(a.department.equals(b.department))
					return 0;
				else
					return a.department.compareTo(b.department);
			}
		};
		
		Comparator<Employee> salary_cmp = new Comparator<>() {
			public int compare(Employee a, Employee b) {
				if(a.salary==b.salary)
					return 0;
				else if(a.salary>b.salary)
					return 1;
				else
					return -1;
			}
		};
		
		switch(c) {
		case 'a':
			Collections.sort(e, id_cmp);
			for(Employee z: e)
				System.out.println(z);
			break;
		
		case 'b':
			Collections.sort(e, name_cmp);
			for(Employee z: e)
				System.out.println(z);
				break;
		
		case 'c':
			Collections.sort(e, department_cmp);
			for(Employee z: e)
				System.out.println(z);
				break;
			
		case 'd':
			Collections.sort(e, salary_cmp);
			for(Employee z: e)
				System.out.println(z);
				break;
		
		default:
			System.out.println("Inavlid Input");
				break;
		}
	}

}