package homework;

import java.util.Scanner;

public class Task_3 {
	
	public static int lottery(int enteredNumber) {
		int desiredNumber = 1 + (int) (Math.random()*50);
		 if (enteredNumber == desiredNumber) {
			System.out.println("Neverovatno! Pogodili ste tačan broj!"); 
			return 0;
		}
		else if (Math.abs(enteredNumber - desiredNumber) <= 5) {
			System.out.println("Dobar pokušaj, bili ste jako blizu!");
			return 1;
		}
		else {
			System.out.println("Više sreće sledeći put...");
			return 2;
		}
	}

	public static void main(String[] args) {
		
		Scanner insertedValue = new Scanner(System.in);	
		
		System.out.println("Unesite jedan ceo broj od 1 do 50:");
		
		int result = 2; 
		while (result == 2) {
			int enteredNumber = insertedValue.nextInt();
			result = lottery(enteredNumber);
			System.out.println("Nastavite da pogađate.");
		}
	}

}
