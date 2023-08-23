package StringPractice;

public class String_Basic {

	public static void main(String[] args) {
		
		String str1 = "Sujata";
		String 	str2 = "Lokhande";
		System.out.println("" +str1);
		System.out.println("" +str2);
		
		if(str1==str2) 
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("both strings are not equal");
		}
		
		String str3 = new String("Java Programming");
		String str4= new String("Java Programming");
		System.out.println("" +str3);
		System.out.println("" +str4);

		
		if(str3 == str4) 
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("both strings are not equal");
		}
	}

}
