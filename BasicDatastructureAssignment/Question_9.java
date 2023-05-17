package BasicDatastructureAssingment;
import java.util.*;

public class Question_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] marks = new int[3][3];
		for(int i=0; i<3; i++) {
			System.out.println("Student " + (i+1) + ": ");
			for(int j=0; j<3; j++) {
				marks[i][j] = sc.nextInt();
			}
		}
		int[] total = new int[3];
		
		for(int j=0; j<3; j++) {
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum+= marks[i][j];
			}
			total[j] = sum;
		}
		for(int i=0; i<3; i++) {
			System.out.println("Total marks in " + (i+1) + " subject: " + total[i]);
			System.out.println("Average marks in " + (i+1) + " subject: " + (double)(total[i]/3));
		}
	}

}