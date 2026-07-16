package edicola;

import java.util.*;

public class PubblicazioneTest {

	public static void main(String[] args) {
		char scelta;
		Scanner inputTesti = new Scanner(System.in);
		Scanner inputNumeri = new Scanner(System.in);
		boolean ancora = true;

		ArrayList<Pubblicazione> prodotti = new ArrayList<>();

		do {

			Pubblicazione miaPubblicazione = new Pubblicazione();

			System.out.println("Inserisci il titolo della pubblicazione: ");
			miaPubblicazione.setnome(inputTesti.nextLine());

			System.out.println("Inserisci le copie ricevute della pubblicazione: ");
			miaPubblicazione.setcopieRicevute(inputNumeri.nextInt());

			System.out.println("Inserisci il prezzo della pubblicazione: ");
			miaPubblicazione.setprezzo(inputNumeri.nextDouble());

			System.out.println("Inserisci l'aggio della pubblicazione: ");
			miaPubblicazione.setaggio(inputNumeri.nextDouble());

			System.out.println("Inserisci le copie vendute della pubblicazione: ");
			miaPubblicazione.setcopieVendute(inputNumeri.nextInt());

			miaPubblicazione.display();

			prodotti.add(miaPubblicazione);

			System.out.println("Vuoi inserire un'altra pubblicazione (S/N)?");
			scelta = inputTesti.nextLine().toUpperCase().charAt(0);

			if (scelta == 'N') {
				ancora = false;
			}
		} while (ancora);

		for (int i = 0; i < prodotti.size(); i++) {
			System.out.println("Pubblicazione: " + (i + 1));
			prodotti.get(i).display();
		}

		inputTesti.close();
		inputNumeri.close();
		System.exit(0);
	}
}