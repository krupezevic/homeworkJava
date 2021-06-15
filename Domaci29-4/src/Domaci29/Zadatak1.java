package Domaci29;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		//String pol=ispis("Vojislav", "Krupezevic", "muski"); //drugi nacin
		
		System.out.println("Ime: ");                   //
		String ime = s.next();                         //
		System.out.println("Prezime: ");               //
		String prezime = s.next();                     // ili mozemo ovaj deo zakomentarisati
		System.out.println("Pol(muski/zenski): ");     // pa uraditi na drugi nacin
		String pol = s.next();                         //
		System.out.println(ispis(ime, prezime, pol));  //
		
		//System.out.println(pol); //drugi nacin
		s.close();
	}

	public static String ispis(String ime, String prezime, String pol) {
		String rec;
		//System.out.println("ime: " + ime + "\nprezime: " + prezime + "\npol: " +
		// pol);  //drugi nacin

		if (pol.equals("muski")) {
			rec = "Dobrodosao u IT";
		} else if (pol.equals("zenski")) {
			rec = "Dobrodosla u IT";

		} else {
			rec="Pogresan unos! Upisite muski ili zenski";
		}

		return rec;
	}

}
