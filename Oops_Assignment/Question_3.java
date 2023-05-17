package Oops_Assignment;

class Bank {
	
	int bank_cash = 1000000;
	public int total() {
		return bank_cash;
	}
}

class Savings extends Bank {
	
	int fixed_dep;
	@Override
	public int total() {
		return fixed_dep;
	}	
}

class Current extends Bank {
	
	int credit;
	@Override
	public int total() {
		return credit;
	}
}
public class Question_3{

	public static void main(String[] args) {
		Bank b = new Bank();
		Savings s = new Savings();
		Current c = new Current();
		s.fixed_dep = 10000;
		c.credit = 20000;
		
		System.out.println(s.total() + c.total() + b.total());

	}

}