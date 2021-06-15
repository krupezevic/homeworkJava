package Domaci26;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Unesite broja dana u jednom mesecu: ");
		int brDana=s.nextInt();
		
		switch(brDana) {
		
		case 28: {
			System.out.println("1 mesec u godini ima 28 dana");
			break;
		}
		case 29: {
			System.out.println("1 mesec u godini ima 29 dana");
			break;
		}
		case 30:{
			System.out.println("4 meseca u godini ima 30 dana");
			break;
		}
		case 31:{
			System.out.println("7 meseci u godini ima 31 dan");
			break;
		}
		default:{
			System.out.println("Uneli ste pogresan broj, unesite 28,29,30 ili 31");
			break;
		}
		}
		
		
		
		s.close();
		
	}

}
