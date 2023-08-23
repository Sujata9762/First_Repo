package StringPractice;
import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {

		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		num2=sc.nextInt();
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("1st Number after swapping:" +num1 );
		System.out.println("2nd Number after swapping:" +num2 );

		
	}

}
