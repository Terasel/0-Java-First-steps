package switchascensor;

import java.util.Scanner;

public class SwitchAscensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pis = 0;
		String resposta = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("A quin pis vols anar?");
		pis = entrada.nextInt();
		
		switch(pis) {
		case 1:
			resposta = "Moda Infantil";
			break;
		case 2:
			resposta = "Zona tecno";
			break;
		case 3:
			resposta = "Decoració de la llar";
			break;
		default:
			resposta = "Escull una opció entre 1 i 3";
			break;
		}
		System.out.println(resposta);
	}

}
