package foreachtenda;

import java.util.ArrayList;

public class ForEachTenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> productes = new ArrayList<String>();
		
		productes.add("Pera");
		productes.add("Llimona");
		productes.add("Síndria");
		productes.add("Mandarina");
		productes.add("Poma");
		
		for(String producte: productes) {
			System.out.println("Item: " + producte);
		}
		
	}

}
