package BasicDatastructureAssingment;
import java.util.*;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.print("Enter value: ");
		int b = sc.nextInt();
		for(int i=0; i<15; i++) {
			if(a[i]==b) {
				System.out.print("Value found at index " + (i+1));
				break;
			}
		}
	}

}