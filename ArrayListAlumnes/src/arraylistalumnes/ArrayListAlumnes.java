package arraylistalumnes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlumnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio = 0;
		int posicio = 0;
		String nom = "";
		ArrayList<String> alumnes = new ArrayList<String>();
		
		alumnes.add("Albert");
		alumnes.add("Cristina");
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Quina opció desitges?\n" + "1. Alta alumne.\n"
					+ "2. Veure alumnes.\n" + "3. Eliminar alumne.");
			
			opcio = entrada.nextInt();
			
			switch(opcio) {
			case 1:
				System.out.println("Digues el nom de l'alumne: ");
				nom = entrada.next();
				alumnes.add(nom);
				System.out.println(alumnes);
				break;
			case 2:
				System.out.println(alumnes);
				break;
			case 3:
				System.out.println(alumnes);
				System.out.println("Digues la posició de l'alumne que vols esborrar: ");
				posicio = entrada.nextInt();
				alumnes.remove(posicio);
				System.out.println(alumnes);
				break;
			}
		}
		
	}

}
