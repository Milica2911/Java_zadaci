package homework;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner insertedValue = new Scanner(System.in);	
		System.out.println("Uneti tačan broj studenata.");
		int n = insertedValue.nextInt();
		int max = 0;
		String best = "";
		for (int i = 1; i <= n; i++) {
			System.out.println("Uneti ime studenta i njegov broj poena:");
			String student = insertedValue.next();
			int points = insertedValue.nextInt();
			if (max <= points) {
				max = points;
				best = student;
			}
		}
		System.out.println("Student sa najvećim brojem poena je " + best + " (" + max + ").") ;

	}

}
