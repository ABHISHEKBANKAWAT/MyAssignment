package BasicDatastructureAssingment;
import java.util.*;

public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String username = "Abhishek", password = "Abhi";
		String user, pass;
		int count = 0;
		for(int i=0; i<3; i++) {
			count++;
			System.out.print("Enter username: ");
			user = sc.nextLine();
			System.out.print("Enter password: ");
			pass = sc.nextLine();
			if(username.equals(user) && password.equals(pass)) {
				System.out.print("Welcome: " + username);
				break;
			}
			else
				System.out.print("Wrong credentials");
				
		}
		if(count==3)
			System.out.print("Contact Admin");

	}

}