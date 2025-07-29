package funcioparametressalutacio;

public class FuncioParametresSalutacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Arnau";
		
		saludarPersona(nom);
		saludarPersona("Pedro");
		saludarPersona("Ana");
		
	}

	private static void saludarPersona(String nom) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola classe, el meu nom és: " + nom);
		
	}

}
