package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		double prezzoKm = 0.21,
				scontoAnziani = 0.60,
				scontoGiovani = 0.80;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di km che vuoi percorrere");
		int KmUtente = sc.nextInt();
		
		System.out.println("Inserisci la tua età");
		int EtaUtente = sc.nextInt();
		
		double prezzoPieno = KmUtente * prezzoKm;
		
		if ( EtaUtente > 65 ) {
			System.out.println("Prezzo finale: " + String.format("%.2f" ,(prezzoPieno * scontoAnziani)));			
		}
		else if (EtaUtente < 18) {
			System.out.println("Prezzo finale: " + String.format("%.2f" ,(prezzoPieno * scontoGiovani)));
		}
		else {
			System.out.println("Prezzo finale: " + String.format("%.2f" ,prezzoPieno));
		}
		
		sc.close();
	}
	
}
