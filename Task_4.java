package homework;

import java.util.Scanner;

public class Task_4 {
	
	public static int addition(int a, int b) {
		return a + b;
	}
	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static int multiplication(int a, int b) {
		return a * b;
	}
	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner insertedValue = new Scanner(System.in);	
		
		System.out.println("Unesite bilo koja 2 cela broja i kod za izvršavanje željene operacije:\n" +
				"'s' - sabiranje, 'o' - oduzimanje, 'm' - množenje, 'd' - deljenje");
		
		int a = 0;
		int b = 0;	
		int result = 0;
		String codeLetter = "";
		
		while (true) {
			a = insertedValue.nextInt();
			b = insertedValue.nextInt();
			codeLetter = insertedValue.next();
			if (codeLetter.equalsIgnoreCase("s")) {
				result = addition(a,b); 
				System.out.println("Rezultat željene operacije je " + result);
			}
			else if (codeLetter.equalsIgnoreCase("o")) {
				result = subtraction(a,b); 
				System.out.println("Rezultat željene operacije je " + result);
			}
			else if (codeLetter.equalsIgnoreCase("m")) {
				result = multiplication(a,b);
				System.out.println("Rezultat željene operacije je " + result);
			}
			else if (codeLetter.equalsIgnoreCase("d")) {
				result = division(a,b);
				System.out.println("Rezultat željene operacije je " + result);
			}
			else 
				break;
		}

	}

}
