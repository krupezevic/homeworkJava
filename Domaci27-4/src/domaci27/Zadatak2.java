package domaci27;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojacDeljivih = 0;
		for (int i = 9; i <= 250; i++) {

			if (i % 3 == 0) {
				brojacDeljivih++;
			}
		}
		System.out.println("Ukupno brojeva deljivih sa 3 je: " + brojacDeljivih);

	}

}
