package Collections;
import java.util.*;

enum Gender {Male, Female};
class Contact {
	Contact(long p, String n, String e, Gender g){
		PhoneNumber=p;
		Name=n;
		Email=e;
		gender=g;
	}
	long PhoneNumber;
	String Name, Email;
	Gender gender;
	
	public String toString() {
		return ("Name = " + Name + ", Email = " + Email + ", Gender = " + gender);
	}
}
public class Question1 {

	public static void main(String[] args) {
		TreeMap<Long, Contact> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(9987654321L, new Contact(9987654321L, "A", "a@gmail.com", Gender.Male));
		tm.put(4887654321L, new Contact(4887654321L, "B", "b@gmail.com", Gender.Female));
		tm.put(5580654321L, new Contact(5580654321L, "C", "c@gmail.com", Gender.Male));
		tm.put(9187654321L, new Contact(9187654321L, "D", "d@gmail.com", Gender.Female));
		tm.put(9287654321L, new Contact(9287654321L, "E", "e@gmail.com", Gender.Male));
		tm.put(6987654321L, new Contact(6987654321L, "F", "f@gmail.com", Gender.Female));
		tm.put(8987654321L, new Contact(8987654321L, "G", "g@gmail.com", Gender.Male));
		tm.put(7987654321L, new Contact(7987654321L, "H", "h@gmail.com", Gender.Female));

		System.out.println(tm.keySet());
		System.out.println();
		System.out.println(tm.values());
		System.out.println();
		
		for(Map.Entry<Long, Contact> m: tm.entrySet())
			System.out.println(m.getKey() + " - " + m.getValue());;
		
	}

}