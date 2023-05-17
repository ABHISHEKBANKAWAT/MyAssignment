package BasicDatastructureAssingment;

public class Question_8 {

	public static void main(String[] args) {
		int a[] = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n = 15;
        for (int i=0; i<n-1; i++)
            for (int j=0; j<(n-i-1); j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        for(int i=0; i<15; i++)
        System.out.print(a[i] + " ");
	}

}