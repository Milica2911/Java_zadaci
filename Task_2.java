package homework;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner insertedValue = new Scanner(System.in);

		System.out.println("Unesite bilo koja 2 cela broja i kod za izvr�avanje �eljene operacije:\n" +
				"'s' - sabiranje, 'o' - oduzimanje, 'm' - mno�enje, 'd' - deljenje");

			int num1 = insertedValue.nextInt();
			int num2 = insertedValue.nextInt();
			String codeLetter = insertedValue.next();
			
			if  (codeLetter.equalsIgnoreCase("s")) 
				System.out.println("Rezultat �eljene operacije je " + (num1 + num2) + ".");
			
			else if (codeLetter.equalsIgnoreCase("o")) 
				System.out.println("Rezultat �eljene operacije je " + (num1 - num2) + ".");
			
			else if (codeLetter.equalsIgnoreCase("m")) 
				System.out.println("Rezultat �eljene operacije je " + (num1 * num2) + ".");
			
			else if (codeLetter.equalsIgnoreCase("d")) 
				System.out.println("Rezultat �eljene operacije je " + (num1 / num2) + ".");
			
			else 
				System.out.println("Nepravilan kod za operaciju!");
			
	}
}
