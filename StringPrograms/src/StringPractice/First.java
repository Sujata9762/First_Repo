package StringPractice;

public class First {

	public static void main(String[] args) {

		String str1 = "Sujata";
		String str2 = new String("Lokhandee");
		int len = str1.length();

		System.out.println("First character of string is :" + str1.charAt(0));
		
		System.out.println("Last character of string is :" + str1.charAt(len - 1));
		
		System.out.println("String concatenation :" +str1.concat(str2));
		
	}

}
