package calculadoraedats;

import java.util.Scanner;

public class CalculadoraEdats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int edatActual = 30;
		int anys = 10;
		
		System.out.println("D'aquí a " + anys + 
				" anys la teva edat serà de " + (edatActual + anys));*/
		
		int edatActual;
		int anys;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digues la teva edat");
			edatActual = entrada.nextInt();
			
			System.out.println("Digues un nombre d'anys en el futur");
			anys = entrada.nextInt();
		}
		
		System.out.println("D'aquí a " + anys + " anys la teva edat serà de " + (edatActual + anys));
		
	}

}
