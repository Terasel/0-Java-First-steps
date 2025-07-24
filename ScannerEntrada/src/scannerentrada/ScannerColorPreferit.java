package scannerentrada;

import java.util.Scanner;

public class ScannerColorPreferit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Quin és el teu color preferit");
			String color = entrada.nextLine();
					
			System.out.println("Mola! El " + color + " és un color genial");
		}
		
	}

}
