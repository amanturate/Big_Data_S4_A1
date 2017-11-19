package Session_4;

import java.util.Scanner;

public class Task_3 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0, b=0;
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter First number :");
		//to record input from user into variable a
		a = scan.nextInt();
		
		System.out.println("Enter Second number :");
		//to record input from user into variable b
		b = scan.nextInt();
		
		System.out.println("First number is :" + a);
		System.out.println("Second number is :" + b);
		System.out.println("Sum is " + sum(a,b));
	}
	
	public static int sum(int a, int b){
		 
		return a+b;
	}

}
