package pooherencia;

public class Cotxe extends Vehicle {
	
	private boolean descapotable;
	
	public Cotxe(String marca, String model, int motor, boolean descapotable) {
		super(marca, model, motor);
		this.descapotable = descapotable;
	}
	
	public Cotxe(String color, String marca, String model, int motor, boolean descapotable) {
		super(color, marca, model, motor);
		this.descapotable = descapotable;
	}
	
	public boolean getDescapotable() {
		return this.descapotable;
	}
	
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	public void accelerar() {
		super.setVelocitat(super.getVelocitat() + 15);
	}
	
	public void frenar() {
		super.setVelocitat(super.getVelocitat() - 5);
	}
	
	public String toString() {
		String resposta = (this.descapotable)? " Sóc descapotable." : " No sóc descapotable.";
		return "Sóc un cotxe amb l'id " + super.getId() + " de color " + super.getColor() + " de la marca " + super.getMarca() + 
				" i del model " + super.getModel() + " amb un motor " + super.getMotor() + " c.c"
				+ " i circulo a " + super.getVelocitat() + " Kh/h." + resposta;
	}
	
}