package Session_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_6 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb;
		List<Integer> value = new ArrayList<Integer>();
		
		scan = new Scanner(System.in);
		do{
			
			System.out.println("How many number you want to enter (2/3): ");
			if(!scan.hasNextInt())
			{
				scan.nextLine();
				System.out.println("Please enter a valid input (2/3): ");
			}
				numb = scan.nextInt();
		}while(!(numb==2 || numb==3));
		
		for(int x=0; x<numb;x++){
			System.out.println("Number "+ (x+1));
			if(!scan.hasNextInt())
			{
				scan.nextLine();
				System.out.println("Please enter a valid input: ");
			}
				 value.add(scan.nextInt());
		}
		
		if(numb == 2) sum(value.get(0).intValue(),value.get(1).intValue());
		
		if(numb == 3) sum(value.get(0).intValue(),value.get(1).intValue(),value.get(2).intValue());
		
		 
		
		
	}
	
	//Overloaded sum() - takes 2 parameters
	public static void sum(int a, int b) {
		System.out.println(a +" + " + b + " = " + (a+b));
	}
	
	//Overloaded sum() - takes 3 parameters
	public static void sum(int a, int b, int c) {
		System.out.println(a +" + " + b + " + " + c +" = " + (a+b+c));
	}

}
