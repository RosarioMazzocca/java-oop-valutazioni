package it.corso.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		CalcolaValutazione[] randomValutazione = new CalcolaValutazione[20];
		
		Random randomGenerator = new Random();
		
		int idStudente, percentualeAssenze;
		double mediaVoti;
		double max = 5.0D;
		
		for(int i = 0; i < randomValutazione.length; i++) {
			idStudente = i +1;
			percentualeAssenze = randomGenerator.nextInt(100) + 1;
			mediaVoti = randomGenerator.nextDouble() * max;
		
			randomValutazione[i] = new CalcolaValutazione(idStudente, percentualeAssenze, mediaVoti);
			
			System.out.println("Studente di ID: " + randomValutazione[i].idStudente + " con percentuale assenze: " + randomValutazione[i].percentualeAssenze);
			if(randomValutazione[i].promossoBocciato() == true) {
				System.out.println("Sei stato promosso");
			} else {
				System.out.println("Sei stato bocciato");
			}
		}
	}
}	
	