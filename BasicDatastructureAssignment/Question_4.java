package BasicDatastructureAssingment;
import java.util.*;

public class Question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of subject 1: ");
		int a = sc.nextInt();
		System.out.print("Enter marks of subject 2: ");
		int b = sc.nextInt();
		System.out.print("Enter marks of subject 3: ");
		int c = sc.nextInt();
		
		if(a>60 && b>60 && c>60)
			System.out.print("Passed");
		else if(a<=60 && b<=60 || b<=60 && c<=60 || a<=60 && c<=60)
			System.out.print("Failed");
		else
			System.out.print("Promoted");
	}

}