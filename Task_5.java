package homework;

import java.util.Scanner;
import java.util.Arrays;

public class Task_5 {

	public static void main(String[] args) {
		
		//kreiranje niza:
		
		Scanner insertedValue = new Scanner(System.in);	
				
		System.out.println("Uneti ukupan broj elemenata niza");
		int numberOfElements = insertedValue.nextInt();
		int [] newArray = new int[numberOfElements];
		
		for (int i = 0; i < numberOfElements; i++) {
			System.out.println("Unesite novi celobrojni element niza");
			int newNumber = insertedValue.nextInt();
			newArray[i] = newNumber;
			}	
		System.out.println("Novi niz je: " + Arrays.toString(newArray));
		
		//sortiranje clanova niza:
		
		Arrays.sort(newArray); 
        System.out.println("Sortirani niz je: " + Arrays.toString(newArray)); 
        
        //da li niz sadrzi broj x:
        
        System.out.println("Da li niz sadrži broj (unesite neki broj).");
        
        int numX = insertedValue.nextInt();
        
        int result = Arrays.binarySearch(newArray, numX);
        if (result >= 0) 
            System.out.println("Niz sadrži element " + numX);
        else 
        	System.out.println("Niz ne sadrži element " + numX);
        
       //pomocu for petlje: 
       /* 
        boolean result = false; 
        for (int i = 0; i < numberOfElements; i++) {
            if (newArray[i] == numX) {
            	result = true;
            	break;
            }	
        }  
        if (result == true) 
            System.out.println("Niz sadrži element " + numX);
        else 
        	System.out.println("Niz ne sadrži element " + numX);
        */
        
        //ispisivanje prvih 5 clanova sortiranog niza:
        
		System.out.println("Prvih 5 elemanata niza su:");		
		for (int i = 0; i < Math.min(5, numberOfElements); i++) {
				System.out.println(newArray[i]);
		}   
		
		
	}
}
