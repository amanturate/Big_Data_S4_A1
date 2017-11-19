package Session_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_4 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		int temp;
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		System.out.println("First Number: ");
		a= scan.nextInt();
		
		System.out.println("Second Number: ");
		b= scan.nextInt();
		
		if(a>b){
			temp = b;
			b = a;
			a = temp;
		}
		
		for(int x= a; x<=b; x++){
			if(x%2 == 0){
				even.add(x);
			}
			else odd.add(x);
		}
		
		System.out.println("Even Numbers are: " + even);
		System.out.println("Odd Numbers are: " + odd);
			
	}


}
