package Domaci22;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=5;
		double b=10;
		double c=Math.sqrt(a*a+b*b);
		String stranica = String. format("%.2f",c);
		System.out.println("Ako je prva stranica trougla " + a + "cm, a druga stranica " + b + "cm");
		System.out.println("Treca stranica trougla je " + stranica + "cm");
	}

}
