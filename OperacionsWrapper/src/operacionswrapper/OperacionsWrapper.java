package operacionswrapper;

public class OperacionsWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numPrimitiu = 10;
		
		Integer numWrapper = 10;
		
		System.out.println("Suma dels primitius: " + (numPrimitiu + 5));
		System.out.println("Suma del Wrapper: " + (numWrapper + 5));
		
		System.out.println("\n ----Wrapper ONLY----");
		System.out.println("Convertir a String: " + numWrapper.toString());
		System.out.println("Comparar amb num: " + numWrapper.compareTo(15));
		System.out.println("Valor màxim possible: " + Integer.MAX_VALUE);
		
		Integer numNull = null;
		System.out.println(numNull);
	}

}
