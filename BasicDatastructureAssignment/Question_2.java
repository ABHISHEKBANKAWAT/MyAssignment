package BasicDatastructureAssingment;
import java.util.*;

public class Question_2 {

	public static boolean Armstrong(int a) {
		int test = a, rem, sum=0;
		boolean b;
		while(test>0) {
			rem = test%10;
			sum+= rem*rem*rem;
			test/= 10;
		}
		if(sum==a)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		boolean check;
		for(int i=0; i<=999; i++) {
			check = Armstrong(i);
			if(check==true)
				System.out.println(i);

	}

}
}