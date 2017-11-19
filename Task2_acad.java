package Session_4;

import java.io.IOException;
import java.util.Scanner;

public class Task2_acad {

	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		
		scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = scan.nextInt();
		
		System.out.println("Enter second number : ");
		b = scan.nextInt();
		
		System.out.println("Sum of "+ a + " & "+ b + " is " + (a+b));
		
	}

}
