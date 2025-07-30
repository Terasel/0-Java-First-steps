package pooherencia;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cotxe vehicle1 = new Cotxe("OPEL", "Tigra", 1200, true);
		
		Cotxe vehicle2 = new Cotxe("violeta", "Seat", "León", 1400, false);
		
		Moto vehicle3 = new Moto("Kawasaki", "Ninja", 1400, 2);
		
		vehicle1.setColor("vermell");
		vehicle1.setMarca("Toyota");
		
		vehicle1.accelerar();
		vehicle1.accelerar();
		vehicle1.accelerar();
		vehicle1.accelerar();
		vehicle1.frenar();
		
		vehicle2.setModel("Naomi Campbell");
		vehicle2.setMotor(1600);
		
		vehicle2.frenar();
		vehicle2.frenar();
		
		vehicle3.accelerar();
		vehicle3.accelerar();
		
//		System.out.println(vehicle1.getColor());
//		System.out.println(vehicle1.getMarca());
		System.out.println(vehicle1.toString());
		
//		System.out.println(vehicle2.getColor());
//		System.out.println(vehicle2.getMarca());
		System.out.println(vehicle2.toString());
		
		System.out.println(vehicle3.toString());
		
	}

}
