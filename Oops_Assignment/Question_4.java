package Oops_Assignment;

abstract class Abstraction{
	
	abstract void Test1();
	abstract void Test2();
	public void Test3() {
		System.out.println("Test 3 in abstract class");
	}
}

class A extends Abstraction{
	
	public void Test1() {
		System.out.println("Test 1 in inherited class");
	}
	public void Test2() {
		System.out.println("Test 2 in inherited class");
	}
}

abstract class B extends Abstraction{
	
	abstract void Test4();
}

abstract class C {
	
	public void Test5() {
		System.out.println("Test 5 in abstract class with no abstract methods");
	}
}
public class Question_4 {

	public static void main(String[] args) {
		
	//	Abstraction a = new Abstraction();
	}

}