package metodeclasses;

public class MetodeClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "123";
		int numero = Integer.parseInt(text);
		
		String decimal = "12.5";
		double valor = Double.parseDouble(decimal);
		
		String estat = "true";
		boolean esCert = Boolean.parseBoolean(estat);
		
		System.out.println(numero);
		System.out.println(valor);
		System.out.println(esCert);
		
		String numSt = String.valueOf(10);
		String boolSt = String.valueOf(true);
		String sblSt = String.valueOf(3.14);
		
		System.out.println(numSt);
		System.out.println(boolSt);
		System.out.println(sblSt);
	}

}
