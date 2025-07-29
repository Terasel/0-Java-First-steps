package formultiplicar;

import java.util.Scanner;

public class ForMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int taula = 0;
		int resultat = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digues la taula que desitges...");
			taula = entrada.nextInt();
		}
		
		for(int i = 0; i <= 10; i++) {
			resultat = taula * i;
			System.out.println(taula + " x " + i + " = " + resultat);
		}
		
	}

}
