package Domaci29;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite brojeve od 1 do 10 ");

		int broj;
		for (int i = 1; i <= 10; i++) {
			broj = s.nextInt();
			{
			
				System.out.println(prost(broj));
			}
			
		}
		
		s.close();
	}

	static public String prost(int broj) {
		int brojac = 0;
		String rec;
		for (int i = 2; i <= broj / 2; i++) {
			if (broj % i == 0) {
				brojac++;
			}
		}
		if (brojac == 0) {
			rec = "Broj je prost";
		} else {
			rec = "Broj nije prost";
		}
		return rec;
	}

}

		
			
			
			
	
	
				
			
			
			
		
		
		
	


