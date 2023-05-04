package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		double prezzoKm = 0.21,
				scontoAnziani = 0.6,
				scontoGiovani = 0.8;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di km che vuoi percorrere");
		String strKmUtente = sc.nextLine();
		int intKmUtente = Integer.parseInt(strKmUtente);
		
		System.out.println("Inserisci la tua età");
		String strEtaUtente = sc.nextLine();
		int intEtaUtente = Integer.parseInt(strEtaUtente);
		
		double prezzoPieno = intKmUtente * prezzoKm;
		
		if ( intEtaUtente > 65 ) {
			System.out.println(prezzoPieno * scontoAnziani);			
		}
		else if (intEtaUtente < 18) {
			System.out.println(prezzoPieno * scontoGiovani);
		}
		else {
			System.out.println(prezzoPieno);
		}
	}
	
}
