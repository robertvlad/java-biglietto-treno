package org.lessons.java;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"patatine", "brodo", "bistecca", "frutti", "panino"};
		
		// 1 - lunghezza array;
		
		System.out.println(cibiPreferiti.length);
		
		// 2 - cibo preferito (prima posizione);
		
		System.out.println(cibiPreferiti[0]);
		
		// 3 - cibo ultimo in classifica;
		
		System.out.println(cibiPreferiti[cibiPreferiti.length - 1]);
		
		// 4 - bonus;
		
		if (cibiPreferiti.length % 2 == 0) {
			
			System.out.println("I cibi in mezzo alla lista sono 2 e sono:");
			System.out.println(cibiPreferiti[cibiPreferiti.length / 2 - 1]);
			System.out.println(cibiPreferiti[cibiPreferiti.length / 2]);
			
		}
		else {
			
			System.out.println("Il cibo in mezzo alla classifica è:");
			System.out.println(cibiPreferiti[cibiPreferiti.length / 2]);
			
		}
		
	}
}
