package homework;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner insertedValue = new Scanner(System.in);	
		
		System.out.println("Unesite bilo koja dva cela broja.");
		int a = insertedValue.nextInt();
		int b = insertedValue.nextInt(); 
		
		System.out.println("Parni brojevi između " + a + " i " + b + " su:");
		
		if (a % 2 == 1)
			a++;	
		while (a <= b) {
			System.out.println(a);
			a += 2;
		}
	}

}
