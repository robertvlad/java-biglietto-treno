package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		String[] invitati = {"Dua Lipa" , "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi" , "Bebe Vio" , "Luis" , "Pardis Zarei" , "Martina Maccherone" , "Rachel Zeilic" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");		
		String nomeGuest = sc.nextLine();
		
		
		boolean finded = false;
		
		// Soluzione con ciclo for;
		
		for ( int i = 0; i < invitati.length ; i++ ) {	
						
			if ( nomeGuest.equals(invitati[i]) ) {
				
				finded = true;				
			}	
		}
		
		if (finded) {
			
			System.out.println("Lei è stato invitato alla festa");
		}
		else {
			
			System.out.println("Lei NON è stato invitato alla festa");
		}
		
		
		
		// soluzione con ciclo while;
		
		int x = 0;		
		
		while (x < invitati.length) {
			
			if (nomeGuest.equals(invitati[x])){
				
				finded = true;
			}
			
			x++;
		}
		
		if (finded) {
				
			System.out.println("Lei è stato invitato alla festa");
		}
		else {
				
			System.out.println("Lei NON è stato invitato alla festa");
		}
	}
}
