package homework;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		Scanner insertedValue = new Scanner(System.in);
		
	    System.out.println("Unesite jedan ceo broj u opsegu od 1 do 50.");
	    
	    int desiredNumber = 1 + (int) (Math.random()*50);
		int enteredNumber = insertedValue.nextInt();
		
		System.out.println("Zamišljeni broj je bio " + desiredNumber + ".");
		
		if (enteredNumber < 1 || enteredNumber > 50) 
			System.out.println("Uneli ste broj izvan zadatog opsega.");
		else if (enteredNumber == desiredNumber) 
			System.out.println("Neverovatno! Pogodili ste tačan broj!");
		else if (Math.abs(enteredNumber - desiredNumber) <= 5) 
			System.out.println("Dobar pokušaj, bili ste jako blizu!");
		else 
			System.out.println("Više sreće sledeći put...");

	}
	
}
