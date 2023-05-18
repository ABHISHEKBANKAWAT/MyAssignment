package Generics;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> h = new HashMap<>();
		h.put(1,1.11);
		h.put(2,2.22);
		h.put(3,3.33);
		h.put(4,4.44);
		h.put(5,5.55);
		h.put(6,6.66);
		h.put(7,7.77);
		h.put(8,8.88);
		h.put(9,9.99);
		h.put(10,10.1010);
		
		for(Map.Entry m : h.entrySet())
			System.out.println(m.getKey() + " + " + m.getValue());
	}

}