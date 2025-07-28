package comparaciocadenes;

public class ComparacioCadenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "Pepe";
		String cadena2 = "PEPE";
		
		System.out.println(cadena1 == cadena2);
		System.out.println(cadena1.equals(cadena2));
		System.out.println(cadena1.equalsIgnoreCase(cadena2));
		
	}

}
