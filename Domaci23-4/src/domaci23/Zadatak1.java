package domaci23;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Unesite ime: ");
		String ime=s.nextLine();
		System.out.println("Unesite prezime: ");
		String prezime=s.nextLine();
		System.out.println("Unesite broj godina: ");
		int brGod=s.nextInt();
		
		System.out.println("Ime: " + ime + "\nPrezime: " + prezime);
		System.out.println("Godina rodjenja: " + (2021-brGod)+ ".");
		
		s.close();
	}

}
