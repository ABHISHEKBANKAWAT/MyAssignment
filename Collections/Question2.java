package Collections;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		
		t.add(60);
		t.add(44);
		t.add(21);
		t.add(56);
		t.add(22);
		t.add(49);
		t.add(68);
		t.add(12);
		t.add(5);
		t.add(8);
		t.add(44);  //duplicate

		for(int a: t)
			System.out.print(a + " ");
		System.out.println();
		System.out.print(t.size());
		
	}

}