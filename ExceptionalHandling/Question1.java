package ExceptionHandling;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c = a/b;
			System.out.print(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}