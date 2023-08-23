package StringPractice;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str= "India is my country , I love india";
		int count;
		
		str = str.toLowerCase();
		String Words[] = str.split(" ");
		
		System.out.println("Duplicate words in given string is:");
		for(int i=0; i<Words.length; i++)
		{
			count = 1;
			for(int j=i+1; j<Words.length; j++)
			{
				if(Words[i].equals(Words[j]))
				{
					count++;
					Words[j]="0";
					
				}
			}
		}
	}

}
