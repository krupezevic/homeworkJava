package domaci28;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
      	System.out.println("Unesite datum rodjenja:");
		System.out.print("Dan: ");
		int dan=s.nextInt();
		System.out.print("Mesec: ");
		int mesec=s.nextInt();
		System.out.print("Godina: ");
		//int godina=s.nextInt();
		
		if ((dan>=21 && dan<=31 && mesec==3) || (dan>0 && dan<=20 && mesec==4)){
			System.out.println("Horosposki znak je Ovan");
		}
		else if ((dan>20 && dan<=30 && mesec==4) || (dan>0 && dan<=21 && mesec==5)) {
			System.out.println("Horoskopski znak je Bik");
		}
		else if ((dan>21 && dan<=31 && mesec==5) || (dan>0 && dan<=21 && mesec==6)) {
			System.out.println("Horoskopski znak je Blizanci");
		}
		else if ((dan>21 && dan<=30 && mesec==6) || (dan>0 && dan<=22 && mesec==7)) {
			System.out.println("Horoskopski znak je Rak");
		}
		else if ((dan>22 && dan<=31 && mesec==7) || (dan>0 && dan<=22 && mesec==8)) {
			System.out.println("Horoskopski znak je Lav");
		}
		else if ((dan>22 && dan<=31 && mesec==8) || (dan>0 && dan<=22 && mesec==9)) {
			System.out.println("Horoskopski znak je Devica");
		}
		else if ((dan>22 && dan<=30 && mesec==9) || (dan>0 && dan<=23 && mesec==10)) {
			System.out.println("Horoskopski znak je Vaga");
		}
		else if ((dan>23 && dan<=31 && mesec==10) || (dan>0 && dan<=22 && mesec==11)) {
			System.out.println("Horoskopski znak je Skorpija");
		}
		else if ((dan>22 && dan<=30 && mesec==11) || (dan>0 && dan<=21 && mesec==12)) {
			System.out.println("Horoskopski znak je Strelac");
		}
		else if ((dan>21 && dan<=31 && mesec==12) || (dan>0 && dan<=20 && mesec==1)) {
			System.out.println("Horoskopski znak je Jarac");
		}
		else if ((dan>20 && dan<=31 && mesec==1) || (dan>0 && dan<=19 && mesec==2)) {
			System.out.println("Horoskopski znak je Vodolija");
		}
		else if ((dan>19 && dan<=29 && mesec==2) || (dan>0 && dan<=20 && mesec==3)) {
			System.out.println("Horoskopski znak je Ribe");
		}
		else {
			System.out.println("Nevalidan unos");
		}
		
		s.close();
		
		}
	}


