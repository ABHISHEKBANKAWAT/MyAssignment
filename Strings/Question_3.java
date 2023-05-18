package Strings;
public class Question_3 {

	public static void main(String[] args) {
		String a = "Java String pool refers to collection of Strings which are stored in heap memory";
		
	//Lowercase
		System.out.println(a.toLowerCase());
	
	//Uppercase
		System.out.println(a.toUpperCase());
	
	//Replacement
		System.out.println(a.replace("a", "$"));
		
	//Word Comparison
		if(a.contains("collection"))
			System.out.println("Contains - collection");
		else
			System.out.println("Does not contain - collection");
		
	//String Comparison
		String b = "java string pool refers to collection of strings which are stored in heap memory";
		if(b.equals(a))
			System.out.println("Matched");
		else
			System.out.println("Not Matched");
		
	//String Comparison Ignorecase
		if(b.equalsIgnoreCase(a))
			System.out.println("Matched");
		else
			System.out.println("Not Matched");
			
		
	}

}