package ternari;

import java.util.Scanner;

public class Ternari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resposta = "";
		String aturTxt = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Estàs a l'atur?");
		aturTxt = entrada.next();
		boolean atur = (aturTxt.equalsIgnoreCase("si"))? true : false;
		if(atur) {
			System.out.println("Tens prestació");
		} else {
			System.out.println("No tens prestació");
		}
	}

}
