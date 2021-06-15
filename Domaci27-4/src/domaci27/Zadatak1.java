package domaci27;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int br;
		int suma=0;
		
        for(int i=0; i>=0;i++) {
        	System.out.println("Unesite " + (i+1) + ". broj");
        	br=s.nextInt();
        	suma=suma+br;
        	
        	if(br<0) {
        		System.out.println("Zbir unetih pozitivnih brojeva je: "+ (suma-br));
        		break;
        	}
        }
		
		
		
		
		s.close();
		
		
	}

}
