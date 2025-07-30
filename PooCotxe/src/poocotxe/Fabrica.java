package poocotxe;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cotxe vehicle1 = new Cotxe("blanc", "OPEL", "Tigra", 1200);
		
		Cotxe vehicle2 = new Cotxe("violeta", "Seat", "León", 1400);
		
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
		
		System.out.println(vehicle1.getColor());
		System.out.println(vehicle1.getMarca());
		System.out.println(vehicle1.toString());
		
		System.out.println(vehicle2.getColor());
		System.out.println(vehicle2.getMarca());
		System.out.println(vehicle2.toString());
		
	}

}
