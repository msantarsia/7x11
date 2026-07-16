package edicola;

import java.util.*;

public class Pubblicazione {

	private String nome;
	private int copieRicevute;
	private double prezzo;
	private double aggio;
	private int copieVendute;

	Scanner inputNumeri = new Scanner(System.in);
	Scanner inputTesti = new Scanner(System.in);

	public void setnome(String nome) {
		boolean ancora = true;
		do {
			if (nome.length() >= 3) {
				this.nome = nome;
				ancora = false;
			} else {
				System.out.println("Il nome deve avere almeno 3 caratteri, reinseriscilo: ");
				nome = inputTesti.nextLine();
			}
		} while (ancora);
	}

	public void setcopieRicevute(int copieRicevute) {
		boolean ancora = true;
		do {
			if (copieRicevute >= 1) {
				this.copieRicevute = copieRicevute;
				ancora = false;
			} else {
				System.out.println("Non ci sono copie ricevute, inserisci un numero valido: ");
				copieRicevute = inputNumeri.nextInt();
			}
		} while (ancora);
	}

	public void setprezzo(double prezzo) {
		boolean ancora = true;
		do {

			if (prezzo >= 0.50) {
				this.prezzo = prezzo;
				ancora = false;
			} else {
				System.out.println("Il prezzo inserito è troppo basso o negativo, reinseriscilo: ");
				prezzo = inputNumeri.nextDouble();
			}
		} while (ancora);
	}

	public void setaggio(double aggio) {
		boolean ancora = true;
		do {
			if (aggio >= 5 && aggio <= 20) {
				this.aggio = aggio;
				ancora = false;
			} else {
				System.out.println("L'aggio deve essere compreso tra 5 e 20, reinseriscilo: ");
				aggio = inputNumeri.nextDouble();
			}
		} while (ancora);
	}

	public void setcopieVendute(int copieVendute) {
		boolean ancora = true;
		do {

			if (copieVendute >= 0 && copieVendute <= copieRicevute) {
				this.copieVendute = copieVendute;
				ancora = false;
			} else {
				System.out.println(
						"Non puoi vendere più copie di quante ne hai ricevute o un valore negativo, reinserisci: ");
				copieVendute = inputNumeri.nextInt();
			}
		} while (ancora);
	}

	public String getnome() {
		return nome;
	}

	public int getcopieRicevute() {
		return copieRicevute;
	}

	public int getcopieVendute() {
		return copieVendute;
	}

	public double getprezzo() {
		return prezzo;
	}

	public double getaggio() {
		return aggio;
	}

	
	public int getcopieRese() {
		return copieRicevute - copieVendute;
	}

	
	public double getguadagnoNetto() {
		return (double) copieVendute * prezzo * (aggio / 100);
	}

	public void display() {
		System.out.println("Il nome della pubblicazione è: " + getnome());
		System.out.println("Le copie ricevute sono: " + getcopieRicevute());
		System.out.println("Le copie vendute sono: " + getcopieVendute());
		System.out.println("Il prezzo è: " + getprezzo() + " €");
		System.out.println("L'aggio è: " + getaggio() + "%");
		System.out.println("Le copie rese sono: " + getcopieRese());
		System.out.println("Il guadagno netto è: " + getguadagnoNetto() + " €");
	}
}