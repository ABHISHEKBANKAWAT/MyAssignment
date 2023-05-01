import java.util.*;
public class ArmstrongOrNot{
public Static void main(String[] args){
  Scanner sc = new Scanner(System.in);
		int sum=0, rem;
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int check = a;
		while(a>0) {
			rem = a%10;
			sum+= rem*rem*rem;
			a/= 10;
		}
		if(check==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
}
}