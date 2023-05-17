package BasicDatastructureAssingment;
import java.util.*;

public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter CTC: ");
		int ctc = sc.nextInt();
		
		if(ctc>=0 && ctc<=180000)
			System.out.print("Tax payable: 0");
		if(ctc>=181000 && ctc<=300000)
			System.out.print("Tax payable: " + ctc*0.1);
		if(ctc>=300001 && ctc<=500000)
			System.out.print("Tax payable: " + ctc*0.2);
		if(ctc>=500001 && ctc<=1000000)
			System.out.print("Tax payable: " + ctc*0.3);
			
	}

}