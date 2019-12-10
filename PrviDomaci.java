package endava;

import java.util.Scanner;

public class PrviDomaci {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
	
		 // prvi zadatak
		
	    System.out.println("Unesite jedan ceo broj u opsegu od 1 do 50.");
	
		int trazeni_broj = 1 + (int) (Math.random()*50);
		trazeni_broj = 35;
		System.out.println(trazeni_broj);
		
		int unos = ulaz.nextInt();
		
		if (unos < 1 || unos > 50) 
			System.out.println("Uneli ste broj izvan zadatog opsega.");
		else if (unos == trazeni_broj) {
			System.out.println("Neverovatno! Pogodili ste tačan broj!");
		}
		else if (Math.abs(unos - trazeni_broj) <= 5) 
			System.out.println("Dobar pokušaj, bili ste jako blizu!");
		else 
			System.out.println("Više sreće sledeći put...");
			

		
		
		// drugi zadatak
		
		System.out.println("Unesite bilo koja 2 cela broja i kod za izvršavanje željene operacije:\n" +
			"'s' - sabiranje, 'o' - oduzimanje, 'm' - množenje, 'd' - deljenje");
	
		int broj1 = ulaz.nextInt();
		int broj2 = ulaz.nextInt();
		String kod = ulaz.next();
		
		if  (kod.equalsIgnoreCase("s")) {
			System.out.println("Rezultat željene operacije je " + (broj1 + broj2));
		}
		else if (kod.equalsIgnoreCase("o")) {
			System.out.println("Rezultat željene operacije je " + (broj1 - broj2));
		}
		else if (kod.equalsIgnoreCase("m")) {
			System.out.println("Rezultat željene operacije je " + (broj1 * broj2));
		}
		else if (kod.equalsIgnoreCase("d")) {
			System.out.println("Rezultat željene operacije je " + (broj1 / broj2));
		}
		else {
			System.out.println("Nepravilan kod za operaciju!");
		}
		
		
	}

}
