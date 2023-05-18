package Strings;

public class Question_7 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("StringBuffer");
		s.append(" is a peer class of String");
		s.append(" that provides much of");
		s.append(" the functionality of strings");
		System.out.println(s);
		
		StringBuilder s2 = new StringBuilder("It is used to  at the specified index position");
		s2.insert(14, "insert text");
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("This method returns the reversed object on which it was called");
		s3.reverse();
		System.out.println(s3);

	}

}