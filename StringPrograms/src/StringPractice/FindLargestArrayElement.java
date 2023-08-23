package StringPractice;

public class FindLargestArrayElement {

	public static void main(String[] args) {
		
		int number[] = new int[] {14,25,85,74,96,35,64};
		
		int Largest = number[0];
		int Smallest = number[0];
		
		for(int i=1; i<number.length; i++)
		{
			if(number[i]>Largest)
			{
				Largest = number[i];
			}
			else if(number[i] < Smallest)
			{
				Smallest = number[i];
			}
			System.out.println("Largest is:" +Largest);
			System.out.println("Smallest is:" +Smallest);
		}

	}
}