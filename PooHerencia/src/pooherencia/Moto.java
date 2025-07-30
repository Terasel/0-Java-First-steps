package pooherencia;

public class Moto extends Vehicle {
	
	private int maletes;
	
	public Moto(String marca, String model, int motor, int maletes) {
		super(marca, model, motor);
		this.maletes = maletes;
	}
	
	public Moto(String color, String marca, String model, int motor, int maletes) {
		super(color, marca, model, motor);
		this.maletes = maletes;
	}
	
	public int getMaletes() {
		return this.maletes;
	}
	
	public void setMaletes(int maletes) {
		this.maletes = maletes;
	}
	
	public void accelerar() {
		super.setVelocitat(super.getVelocitat() + 15);
	}
	
	public void frenar() {
		super.setVelocitat(super.getVelocitat() - 5);
	}
	
	public String toString() {
		return "Sóc una moto amb l'id " + super.getId() + " de color " + super.getColor() + " de la marca " + super.getMarca() + 
				" i del model " + super.getModel() + " amb un motor " + super.getMotor() + " c.c"
				+ " i circulo a " + super.getVelocitat() + " Kh/h i porto " + this.maletes + " maletes.";
	}
	
}
