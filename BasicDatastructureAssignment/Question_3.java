package BasicDatastructureAssingment;
import java.util.*;

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter amount: ");
		int amt = sc.nextInt();
		System.out.print("Enter time (years): ");
		int time = sc.nextInt();
		System.out.print("Enter rate (%): ");
		int rate = sc.nextInt();
		
		double SI = (amt*time*rate)/100;
		double CI_rate = (double)(rate)/100 + 1;
		double CI = (Math.pow(CI_rate, time))*amt - amt;

		System.out.println("Simple interest: " + SI);
		System.out.println("Compound interest: " + CI);
	}

}