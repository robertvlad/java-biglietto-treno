package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Definisci il quantitativo di numeri totali");
		
		int numeroTotale = scan.nextInt();
		
		for ( int i = 1; i <= numeroTotale; i++ ) {
			
			if ( i % 3 == 0 && i % 5 == 0 ) {
				
				System.out.println("Fizzbuzz");
				
			}
			else if ( i % 3 == 0 ) {
				
				System.out.println("Fizz");
				
			}
			else if ( i % 5 == 0 ) {
				
				System.out.println("Buzz");
				
			}
			else {
				
				System.out.println(i);
				
			}
			
		}
		
	}

}
