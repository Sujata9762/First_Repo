package StringPractice;

public class AscendingArray {

	public static void main(String[] args) {

		int arr[] = new int[] {6,5,9,8,7,4,2,1,3,6};
		
		int temp = 0;
		
		System.out.println("Elements in given array : ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " " );
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("Elements in Ascending order :" );
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " " );
		}	
	}

}
