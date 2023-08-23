package StringPractice;

public class Reverse {

	public static void main(String[] args) {

		String str = new String("Sujata");
		String str2 ="";
		char ch;
		
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);  
			str2 = ch+str2;
		}
		System.out.println("Original String : " +str);
		System.out.println("Reverse String is :" +str2);
	}

}
