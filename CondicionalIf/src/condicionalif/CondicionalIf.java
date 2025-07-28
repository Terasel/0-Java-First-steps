package condicionalif;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edat = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digues la teva edat: ");
			edat = entrada.nextInt();
		}
		
		if(edat >= 18) {
			System.out.println("Pots passar!");
		} else if(edat < 18 && edat < 10) {
			System.out.println("No pots passar!");
		} else {
			System.out.println("No pots estar aquí!");
		}
	}

}
