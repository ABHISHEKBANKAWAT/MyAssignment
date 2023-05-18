package ExceptionHandling;
import java.util.*;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(){
		super("InsufficientBalanceException");
	}
}

class IllegalBankTransactionException extends Exception{
	IllegalBankTransactionException(){
		super("IllegalBankTransferException");
	}
}

class SavingAccount {

	long id;
	double balance;
	double withdraw(double amount) {
		return (balance - amount);
	}
	double deposit(double amount) {
		return (balance + amount);
	}
}
public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingAccount s = new SavingAccount();
		System.out.println("Enter your ID: ");
		long id = sc.nextLong();
		s.id=id;
		System.out.println("Enter your balance: ");
		double balance = sc.nextDouble();
		s.balance=balance;
		System.out.println("Withdraw(w) or Deposit(d) ?");
		char a = sc.next().charAt(0);
		System.out.println("Enter amount: ");
		double amount = sc.nextDouble();
		
		try {
			if(amount<0) {
				throw new IllegalBankTransactionException();
			}
			else if(amount>balance || balance==0) {
				throw new InsufficientBalanceException();
			}
			if(a=='w') {
				System.out.println("Amount Withdrawed: " + amount);
				System.out.println("Available Balance: " + s.withdraw(amount));
			}
			if(a=='d') {
				System.out.println("Amount Deposited: " + amount);
				System.out.println("Available Balance: " + s.deposit(amount));
			}
		}
		catch(IllegalBankTransactionException e1) {
			System.out.println(e1.getMessage());
		}
		catch(InsufficientBalanceException e2) {
			System.out.println(e2.getMessage());
		}

	}

}