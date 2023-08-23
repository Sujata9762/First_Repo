package StringPractice;

public class CountString {

	public static void main(String[] args) {

		String str = new String("Hello my name is sujata");
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!= ' ')
			{
				count++;
			}
		}
		System.out.println("Number of character in string is :" +count);
	}

}
