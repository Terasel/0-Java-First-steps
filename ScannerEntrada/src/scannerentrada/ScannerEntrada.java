package scannerentrada;

import java.util.Scanner;

public class ScannerEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom = "";
		String assignatura = "";
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digues el teu nom");
			nom = entrada.nextLine();
			
			System.out.println("Digues la teva assignatura");
			assignatura = entrada.nextLine();
		}
		
		System.out.println("Hola " + nom + ", segur que ets el/la millor en " + assignatura);
		
	}

}
