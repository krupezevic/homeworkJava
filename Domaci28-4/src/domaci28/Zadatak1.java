package domaci28;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double[] nizElemenata={1.3, 1.970, -1000.9 , -0.5, +11};
		double suma=0;
		double arSredina=0;
		
		System.out.print("Elementi niza su: ");
		
		for(int i=0; i<nizElemenata.length; i++) {
			System.out.print(nizElemenata[i] + " ");
		}
	      System.out.println();
	      
        for(int i=0; i<nizElemenata.length; i++) {
			suma=suma+nizElemenata[i];
			arSredina=suma/(i+1);
		}
        
        String arSr= String.format("%.3f", arSredina);
		System.out.println("Aritmeticka sredina svih elemenata u nizu je: " + arSr);
		
		
		
		
	}

}
