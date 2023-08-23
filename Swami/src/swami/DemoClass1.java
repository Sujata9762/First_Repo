package swami;

import java.util.Scanner;

public class DemoClass1 {
	 
	public static void main(String args[]) {
		int x,y,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x , y : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping numbers : " +x +"  "+y );
		s=x;
		x=y;
		y=s;
		System.out.println("After swapping numbers :" +x +" "+y);
		System.out.println();
		
	}
}
