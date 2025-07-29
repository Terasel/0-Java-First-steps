package fabrica;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cotxe vehicle1 = new Cotxe();
		
		vehicle1.color = "vermell";
		vehicle1.marca = "Toyota";
		
		System.out.println(vehicle1.color);
		System.out.println(vehicle1.marca);
		
	}

}
