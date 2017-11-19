package Session_4;

import java.util.Scanner;

public class Task_5 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		while(!scan.hasNextInt()){
			scan.nextLine();
			System.out.println("Enter a valid number: ");
		}
		a = scan.nextInt();
		
		for(int x=1; x<=10; x++){
			System.out.println(a + " * " + x + " = " + a*x);
		}
	}

}
