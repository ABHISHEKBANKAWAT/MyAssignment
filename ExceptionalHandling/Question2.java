package ExceptionHandling;
import java.util.*;

class UnsupportedOperationException extends ArithmeticException {
	
	public UnsupportedOperationException(){
		super("UnsupportedOperationException");
	}
}

public class Question2 {

	public static void main(String[] args) throws UnsupportedOperationException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			if(b==0) {
				throw new UnsupportedOperationException();
			}
			else {
			int c = a/b;
			System.out.print(c);
			}
		}
		catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}

	}

}